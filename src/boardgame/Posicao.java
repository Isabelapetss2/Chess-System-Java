package boardgame;

public class Posicao {
	//linhas e colunas
	
	private int row;
	private int column;
	
	public Posicao(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return "Linha: " + row + ", Coluna: " + column;
	}

	
	
	
	
	
	
	

}
