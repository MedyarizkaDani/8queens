package nqueens.ui;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MessagePanel extends JPanel {
	final JLabel label;
	public MessagePanel() {
		super(new BorderLayout(2,2));
		this.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
		label = new JLabel();
		add(label,BorderLayout.EAST);
		setMessage("");
	}
	public void setMessage(String text){
		this.label.setText("<html><div style='padding:3px;color:red;background-color:#F5A9BC;border:1px solid red'>&nbsp;"+text+"&nbsp;</div></html>");
	}
}
