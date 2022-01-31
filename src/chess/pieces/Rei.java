package chess.pieces;

import boardgame.Tabuleiro;
import chess.Colors;
import chess.PecaDeXadrez;

public class Rei extends PecaDeXadrez {

	public Rei(Tabuleiro tabuleiro, Colors color) {
		super(tabuleiro, color);
	
	}
	
	@Override
	public String toString() {
		return " R ";
	}

}
