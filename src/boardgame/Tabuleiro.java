package boardgame;

public class Tabuleiro {

	private int rows;
	private int columns;
	private Peça[][] pieces;

	public Tabuleiro(int rows, int columns) {

		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: no rows or columns");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Peça[rows][columns];

	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Peça piece(int rows, int columns) {
		if (!positionExists(rows, columns)) {
			throw new BoardException(" Error! Position not on the Board");
		}
		return pieces[rows][columns];
	}

	public Peça piece(Posicao position) {
		return pieces[position.getRow()][position.getColumn()];
	}

	public void lugarDaPeça(Peça piece, Posicao position) {
		if (thereIsAPiece(position)) {
			throw new BoardException(" posição ocupada! " + position);

		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;

	}

	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public boolean positionExists(Posicao position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Posicao position) {
//		if (!positionExists(rows, columns)) {
//			throw new BoardException(" Error! Position not on the Board");
//		}
		
		return piece(position) != null;
	}

}
