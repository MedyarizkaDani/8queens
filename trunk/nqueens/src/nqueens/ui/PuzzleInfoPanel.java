package nqueens.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import nqueens.Board;
import nqueens.solver.NQueensSolver;

public class PuzzleInfoPanel extends JPanel {
	private Board board=null;
	private NQueensSolver solver = null;
	private JPanel panel;
	private BoardAttributesViewer bav;
	private SolverAttributeViewer sav;
	private SolversPanel solverPanel;
	public PuzzleInfoPanel() {
		super(new BorderLayout(2,2));
		panel = new JPanel(new BorderLayout());
		this.solverPanel = new SolversPanel();
		setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		

		final JButton b3 = new JButton("Solve");
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						setBoard(board);
						solver.solve();
						updateInfo();
					}
				}).start();
			}
		});
		final JButton b4 = new JButton("Reset");
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						board.reset();
						solver.reset();
						updateInfo();
					}
				}).start();
			}
		});
		add(panel,BorderLayout.CENTER);
		add(solverPanel,BorderLayout.NORTH);
		solverPanel.add(b3);
		solverPanel.add(b4);
	}
	public void updateInfo() {
		bav.repaint();
		sav.repaint();
	}
	
	public void setBoard(final Board board) {
		this.board=board;
		try {
			solver = solverPanel.getSolver().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		bav = new BoardAttributesViewer(board);
		sav = new SolverAttributeViewer(solver);
		solver.setBoard(board);
		panel.add(sav,BorderLayout.NORTH);
		panel.add(bav,BorderLayout.CENTER);
	}
}
