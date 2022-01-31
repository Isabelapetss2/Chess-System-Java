package boardgame;

public class Tabuleiro {
	
	private int rows;
	private int columns;
	private Pe�a[][] pieces;
	
	
	
	public Tabuleiro(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Pe�a[rows][columns];
		
	}



	public int getRows() {
		return rows;
	}



	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}



	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Pe�a piece(int rows,int columns) {
		return pieces [rows][columns];
	}
	
	public Pe�a piece(Posicao position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	public void lugarDaPe�a(Pe�a piece,Posicao position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
		
	}
	
	






	

}
