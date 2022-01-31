package application;

import chess.Partida;

public class programa {

	public static void main(String[] args) {
		
		
		Partida partida = new Partida();
		UI.printTabuleiro(partida.getPieces());
		
		
		
	}

}
