package chess;

import boardgame.Peça;
import boardgame.Tabuleiro;

public class PecaDeXadrez extends Peça {

	private Colors color;

	public PecaDeXadrez(Tabuleiro tabuleiro, Colors color) {
		super(tabuleiro);
		this.color = color;
	}

	public Colors getColor() {
		return color;
	}

	
	
	

}
