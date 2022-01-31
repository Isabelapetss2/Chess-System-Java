package chess.pieces;

import boardgame.Tabuleiro;
import chess.Colors;
import chess.PecaDeXadrez;

public class Rainha extends PecaDeXadrez {

	public Rainha(Tabuleiro tabuleiro, Colors color) {
		super(tabuleiro, color);
		
	}
	@Override
	public String toString() {
		return " Q ";
	}

}
