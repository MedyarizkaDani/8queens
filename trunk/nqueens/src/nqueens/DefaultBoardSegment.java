package nqueens;

import java.util.HashSet;
import java.util.Set;


public class DefaultBoardSegment implements BoardSegment {
	private Cell[]cells;
	private int pointer=0;
	private boolean blocked;
	private int unblocked;
	private boolean hasQueen;
	private Set<BlockingListener>boardSegmentBlockedListeners;
	public DefaultBoardSegment(int size) {
		super();
		this.boardSegmentBlockedListeners=new HashSet<BlockingListener>();
		cells=new Cell[size];
		unblocked=size;
	}
	public DefaultBoardSegment(int size,BlockingListener boardSegmentBlockedListener) {
		this(size);
		this.boardSegmentBlockedListeners.add(boardSegmentBlockedListener);
	}
	@Override
	public void add(Cell cell) {
		cells[pointer++]=cell;
		cell.addCellChangeListener(new CellChangeAdaptor() {
			
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
			}
			@Override
			public void unblocked(Cell cell) {
				if(isBlocked()){
					notifyLisitenersUnblocked();
				}
				unblocked++;
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
}
