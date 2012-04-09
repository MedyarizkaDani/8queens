package nqueens.ui;

import java.awt.GridLayout;

import javax.swing.JPanel;

import nqueens.Board;
import nqueens.DefaultBoard;

public class BoardContainer extends JPanel {
	private final Board board;
	public BoardContainer(int boardSize) {
		super(new GridLayout(boardSize, boardSize));
		this.board = new DefaultBoard(boardSize);
		for(int r=0;r<boardSize;r++){
			for(int c=0;c<boardSize;c++){
				this.add(new CellContainer(board.getCell(r, c)));
			}
		}
	}
	public Board getBoard() {
		return board;
	}
}
