package boardgame;

public class Tabuleiro {
	
	private int rows;
	private int columns;
	private Peça[][] pieces;
	
	
	
	public Tabuleiro(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Peça[rows][columns];
		
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
	
	public Peça piece(int rows,int columns) {
		return pieces [rows][columns];
	}
	
	public Peça piece(Posicao position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	public void lugarDaPeça(Peça piece,Posicao position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
		
	}
	
	






	

}
