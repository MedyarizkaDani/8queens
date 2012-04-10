package nqueens.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JEditorPane;
import javax.swing.JPanel;

public class MessagePanel extends JPanel {
	final JEditorPane label;
	public MessagePanel() {
		super(new BorderLayout(2,2));
		this.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
		label = new JEditorPane();
		label.setEditable(false);
		label.setContentType("text/html");
		add(label,BorderLayout.CENTER);
		label.setPreferredSize(new Dimension(300,30));
		label.setMinimumSize(label.getPreferredSize());
		label.setSize(label.getPreferredSize());
		setMessage("");
	}
	public void setMessage(String text){
		this.label.setText("<html><div style='width:100%;padding:3px;color:red;background-color:#F5A9BC;border:1px solid red'>&nbsp;"+text+"&nbsp;</div></html>");
	}
}
