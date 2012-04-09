package nqueens;

public enum CellType {
	Dark  (0x58ACFA),
	Light (0xE0ECF8);
	CellType(int color){
		this.color=color;
	}
	private int color;
	public int getColor() {
		return color;
	}
}
