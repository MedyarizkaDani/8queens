package nqueens;

public interface BoardSegment {
	void add(Cell cell);
	boolean isBlocked();
	void addBoardSegmentBlockedListener(BlockingListener boardSegmentBlockedListener);
	Cell getCell(int index);
	int getUnblockedCount();
	Cell[]getEmptyCells();
	void set(int index,Cell cell);
	void set(Cell[]cells);
}
