package boardgame;

public class Posicao {
	//linhas e colunas
	
	private int rows;
	private int columns;
	
	public Posicao(int row, int column) {
		super();
		this.rows = row;
		this.columns = column;
	}

	public int getRow() {
		return rows;
	}

	public void setRow(int row) {
		rows = row;
	}

	public int getColumn() {
		return columns;
	}

	public void setColumn(int column) {
		columns = column;
	}

	@Override
	public String toString() {
		return "Linha: " + rows + ", Coluna: " + columns;
	}

	
	
	
	
	
	
	

}
