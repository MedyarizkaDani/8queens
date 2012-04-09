package nqueens.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

import nqueens.Cell;
import nqueens.CellChangeAdaptor;

public class CellContainer extends JComponent {
	
	private final Cell cell;

	public static Image QUEEN_IMG;
	static{
		try{
			InputStream in = CellContainer.class.getResourceAsStream("queen.png");
			if(null==in){
				throw new Exception("not found");
			}
			QUEEN_IMG = ImageIO.read( in );
		}catch(Exception e){throw new RuntimeException(e);}
	}
	public CellContainer(final Cell cell) {
		super();
		this.cell=cell;
		cell.addCellChangeListener(new CellChangeAdaptor() {
			@Override
			public void changed(Cell cell,boolean isOccupied,int blockLevel) {
				invalidate();
				revalidate();
				repaint();
				validate();
			}
		});
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				super.mousePressed(arg0);
				cell.flipOccupied();
			}
		});
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		final Color bgc = new Color(this.cell.getCellType().getColor());
		g.setColor(bgc);
		g.fillRect(0, 0, getWidth(), getHeight());
		if(this.cell.isOccupied()){
			g.drawImage(QUEEN_IMG, 2, 2, getWidth()-4, getHeight()-4,bgc, this);
		}else if(this.cell.getBlockLevel()>0){
			g.setColor(Color.BLACK);
			int d = getWidth()/10;
			g.fillOval((getWidth()-d)/2, (getHeight()-d)/2, d, d);
		}
	}
}
