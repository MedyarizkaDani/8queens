package nqueens.ui;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import nqueens.CellsBufferType;

public class BufferTypePanel extends JPanel {
	private Class<?>selectedBuffer;
	public BufferTypePanel() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(BorderFactory.createTitledBorder("Select buffer type:"));
		final ButtonGroup group = new ButtonGroup();
		for(final CellsBufferType cbt:CellsBufferType.values()){
			final JRadioButton rb = new JRadioButton(cbt.name());
			rb.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent arg0) {
					if(rb.isSelected()){
						//selectedBuffer=cbt.bufferType;
					}
				}
			});
		}
		((JRadioButton)group.getElements().nextElement()).setSelected(true);
		
	}
	public Class<?> getSelectedBuffer() {
		return selectedBuffer;
	}
}
