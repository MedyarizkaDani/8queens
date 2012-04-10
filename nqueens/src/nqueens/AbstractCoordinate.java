package nqueens;

public class AbstractCoordinate implements Coordinate {
	private final int row,col;
	public AbstractCoordinate(int row,int col) {
		super();
		this.row=row;
		this.col=col;
	}
	@Override
	public int getRow() {
		return row;
	}
	@Override
	public int getCol() {
		return col;
	}
	@Override
	public String toString() {
		return row+"/"+col;
	}
}
