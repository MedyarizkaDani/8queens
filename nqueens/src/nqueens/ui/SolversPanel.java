package nqueens.ui;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import nqueens.solver.Solver;
import nqueens.solver.SolverType;

public class SolversPanel extends JPanel {
	private Class<? extends Solver>solver;
	public SolversPanel() {
		super(new GridLayout(0,1));
		setBorder(BorderFactory.createTitledBorder("Select Solver:"));
		final ButtonGroup optGrp = new ButtonGroup();
		for(final SolverType st:SolverType.values()){
			final JRadioButton rb = new JRadioButton(st.name());
			rb.addChangeListener(new ChangeListener() {				
				@Override
				public void stateChanged(ChangeEvent ce) {
					solver=st.solver();
				}
			});
			optGrp.add(rb);
			add(rb);
		}
		((JRadioButton)optGrp.getElements().nextElement()).setSelected(true);
	}
	public Class<? extends Solver> getSolver() {
		return solver;
	}
}
