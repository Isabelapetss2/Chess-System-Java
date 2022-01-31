package chess.pieces;

import boardgame.Tabuleiro;
import chess.Colors;
import chess.PecaDeXadrez;

public class Bispo extends PecaDeXadrez {

	public Bispo(Tabuleiro tabuleiro, Colors color) {
		super(tabuleiro, color);
	}
	@Override
	public String toString() {
		return " B ";
	}

}
