package boardgame;

public class Peça {

	//generic class
protected Posicao position;
private Tabuleiro tabuleiro;


public Peça(Tabuleiro tabuleiro) {
	this.tabuleiro = tabuleiro;
  
}


protected Tabuleiro getTabuleiro() {
	return tabuleiro;
}



}
