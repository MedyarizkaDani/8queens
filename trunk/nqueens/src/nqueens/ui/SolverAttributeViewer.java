package nqueens.ui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import nqueens.solver.NQueensSolver;
import nqueens.solver.SolverAttributes;

public class SolverAttributeViewer extends JPanel{
	public SolverAttributeViewer(final NQueensSolver solver) {
		super(new BorderLayout());
		final JTable table = new JTable(new AbstractTableModel() {
			@Override
			public Object getValueAt(int row, int col) {
				SolverAttributes sa = SolverAttributes.values()[row];
				return col==0?
					   sa:
					   solver.get(sa);
			}
			@Override
			public int getRowCount() {
				return SolverAttributes.values().length;
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
