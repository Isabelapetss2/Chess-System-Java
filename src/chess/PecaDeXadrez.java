package chess;

import boardgame.Pe�a;
import boardgame.Tabuleiro;

public class PecaDeXadrez extends Pe�a {

	private Colors color;

	public PecaDeXadrez(Tabuleiro tabuleiro, Colors color) {
		super(tabuleiro);
		this.color = color;
	}

	public Colors getColor() {
		return color;
	}

	
	
	

}
