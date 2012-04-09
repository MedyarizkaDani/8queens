package nqueens;

public interface BoardSegment {
	public abstract void add(Cell cell);
	public boolean isBlocked();
	public void addBoardSegmentBlockedListener(BlockingListener boardSegmentBlockedListener);
	public abstract Cell getCell(int index);
	public int getUnblockedCount();
}
