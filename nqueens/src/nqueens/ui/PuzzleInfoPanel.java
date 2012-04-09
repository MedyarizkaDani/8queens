package nqueens.ui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import nqueens.Board;
import nqueens.PuzzleInfo;

public class PuzzleInfoPanel extends JPanel {

	private final JTable table;
	public PuzzleInfoPanel() {
		super(new BorderLayout(2,2));
		
		table = new JTable(new DefaultTableModel(){
			@Override
			public Object getValueAt(int r, int c) {
				if(r<PuzzleInfo.values().length){
					if(c==0) return PuzzleInfo.values()[r];
					else return board.get(PuzzleInfo.values()[r]);
				}
				final int rows = board==null?0:PuzzleInfo.values().length+(board.getBoardSize()*2);
				final int row = r-PuzzleInfo.values().length+1;
				final int col = row - board.getBoardSize();
				if(c==0){
					if(r<rows-board.getBoardSize()){
						return "Row "+ row;
					}else{
						return "Column " + col;
					}
				}else{
					if(r<rows-board.getBoardSize()){
						return board.getRowUnblockedCount(row-1);//.isRowBlocked(row-1);
					}else{
						return board.getColUnblockedCount(col-1);//.isColBlocked(col-1);
					}
				}
			//return null;
			}
			@Override
			public int getRowCount() {
				final int rows = board==null?0:PuzzleInfo.values().length+(board.getBoardSize()*2);
				return rows;
			}
			@Override
			public int getColumnCount() {
				return 2;
			}
		});
		this.add(table,BorderLayout.NORTH);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
	}
	public void updateInfo() {
		table.repaint();
		table.validate();
	}
	private Board board;
	public void setBoard(Board board) {
		this.board = board;
	}
}
