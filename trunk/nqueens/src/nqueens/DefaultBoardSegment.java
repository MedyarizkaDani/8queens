package nqueens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DefaultBoardSegment implements BoardSegment {
	private Cell[]cells;
	private List<Cell>emptyCells;
	private int pointer=0;
	private boolean blocked;
	private int unblocked;
	private boolean hasQueen;
	private Set<BlockingListener>boardSegmentBlockedListeners;
	public DefaultBoardSegment(int size) {
		super();
		this.boardSegmentBlockedListeners=new HashSet<BlockingListener>();
		cells=new Cell[size];
		this.emptyCells=new ArrayList<Cell>();
		unblocked=size;
	}
	public DefaultBoardSegment(int size,BlockingListener boardSegmentBlockedListener) {
		this(size);
		this.boardSegmentBlockedListeners.add(boardSegmentBlockedListener);
	}
	@Override
	public void add(Cell cell) {
		cells[pointer++]=cell;
		emptyCells.add(cell);
		cell.addCellChangeListener(new CellChangeAdapter() {
			
			@Override
			public void undo(Cell cell) {
				hasQueen=false;
			}
			@Override
			public void queenPlaced(Cell cell) {
				hasQueen=true;
			}
			@Override
			public void blocked(Cell cell) {
				unblocked--;
				if(isBlocked()){
					notifyLisitenersBlocked();
				}
				emptyCells.remove(cell);
			}
			@Override
			public void unblocked(Cell cell) {
				if(isBlocked()){
					notifyLisitenersUnblocked();
				}
				unblocked++;
				emptyCells.add(cell);
			}
			
		});
	}

	protected void notifyLisitenersBlocked() {
		for(BlockingListener boardSegmentBlockedListener:boardSegmentBlockedListeners){
			boardSegmentBlockedListener.blocked();
		}
	}
	protected void notifyLisitenersUnblocked() {
		for(BlockingListener boardSegmentBlockedListener:boardSegmentBlockedListeners){
			boardSegmentBlockedListener.unblocked();
		}
	}
	@Override
	public boolean isBlocked() {
		blocked = !hasQueen && unblocked==0;
		return blocked;
	}
	@Override
	public void addBoardSegmentBlockedListener(
			BlockingListener boardSegmentBlockedListener) {
		this.boardSegmentBlockedListeners.add(boardSegmentBlockedListener);
	}
	@Override
	public Cell getCell(int index) {
		return this.cells[index];
	}
	@Override
	public int getUnblockedCount() {
		return unblocked;
	}
	@Override
	public Cell[] getEmptyCells() {
		return emptyCells.toArray(new Cell[emptyCells.size()]);
	}
	@Override
	public void set(int index, Cell cell) {
		this.cells[index]=cell;
	}
	@Override
	public void set(Cell[] cells) {
		this.cells=cells;
	}
	@Override
	public String toString() {
		return Arrays.toString(cells);
	}
}
