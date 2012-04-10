package nqueens.ui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import nqueens.Board;
import nqueens.BoardAttributes;

public class BoardAttributesViewer extends JPanel {
	public BoardAttributesViewer(final Board board) {
		super(new BorderLayout());
		final JTable table = new JTable(new AbstractTableModel() {
			@Override
			public Object getValueAt(int row, int col) {
				BoardAttributes ba = BoardAttributes.values()[row];
				return col==0?
					   ba:
					   board.get(ba);
			}
			
			@Override
			public int getRowCount() {
				return BoardAttributes.values().length;
			}
			
			@Override
			public int getColumnCount() {
				return 2;
			}
		});
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		add(table,BorderLayout.CENTER);
	}
}
