package chess.pieces;

import boardgame.Tabuleiro;
import chess.Colors;
import chess.PecaDeXadrez;

public class Torre extends PecaDeXadrez {

	public Torre(Tabuleiro tabuleiro, Colors color) {
		super(tabuleiro, color);
	}

	@Override
	public String toString() {
		return " T ";
	}

	

}
