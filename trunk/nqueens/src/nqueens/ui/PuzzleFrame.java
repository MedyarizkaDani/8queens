package nqueens.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import nqueens.Board;
import nqueens.BoardChangeListener;

public class PuzzleFrame extends JFrame {
	public PuzzleFrame() {
		super("N-Queens puzzle solver");
		this.setLayout(new BorderLayout());
		final MessagePanel mp = new MessagePanel();
		final BoardContainer bc = new BoardContainer(8);
		final PuzzleInfoPanel pip = new PuzzleInfoPanel();
		final Board board = bc.getBoard();
		
		pip.setBoard(board);
		board.addChangeListener(new BoardChangeListener() {
			@Override
			public void onChanged() {
				pip.updateInfo();
			}
			@Override
			public void blocked() {
				mp.setMessage("The board is blocked");
			}
			@Override
			public void unblocked() {
				mp.setMessage("");
			}
		});
		
		this.getContentPane().add(mp,BorderLayout.NORTH);
		this.getContentPane().add(bc,BorderLayout.CENTER);
		this.getContentPane().add(pip,BorderLayout.WEST);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(500,500));
		this.pack();
	}
	public static void main(String[] args) {
		new PuzzleFrame().setVisible(true);
	}

}
