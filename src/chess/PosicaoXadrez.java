package chess;

import boardgame.Posicao;

public class PosicaoXadrez {
	//esta classe converte a posição da peça para letra e numero da coluna
	private char column;
	private int row;
	public PosicaoXadrez(char column, int row) {
		if(column < 'a'|| column > 'h'|| row<1 || row>8) {
			throw new ChessException("Error! Posição inválida!!");
		}
		this.column = column;
		this.row = row;
	}
	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
	
	
	protected Posicao toPosition() {
		return new Posicao (8 - row,column - 'a');
	}
	
	protected static PosicaoXadrez fromPosition(Posicao position) {
		return new PosicaoXadrez((char)('a'-position.getColumn()),8 - position.getRow());
		
	}
	
	@Override
	public String toString() {
		return " " + column  + row ;
	}
	
	
	

}
