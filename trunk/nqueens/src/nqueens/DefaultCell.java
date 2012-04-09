package nqueens;


public class DefaultCell extends AbstractCell {

	public DefaultCell(Board board, int row, int col) {
		super(board, row, col);
	}

	public DefaultCell(Board board,
			CellChangeListener cellChangeListener, int row, int col) {
		super(board, cellChangeListener, row, col);
	}

}
