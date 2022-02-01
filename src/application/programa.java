package application;

import java.util.Scanner;

import chess.Partida;
import chess.PecaDeXadrez;
import chess.PosicaoXadrez;

public class programa {

	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Partida partida = new Partida();
		
		
		while (true) {
		UI.printTabuleiro(partida.getPieces());
		System.out.println();
		System.out.println("posição inicial: ");
		PosicaoXadrez source = UI.leiaPosicao(sc);
		
		System.out.println();
		System.out.println("posição de destino: ");
		PosicaoXadrez target = UI.leiaPosicao(sc);
		
		PecaDeXadrez capturedPiece = partida.performChessMove(source,target);
	
		
		
		}
		
	}

}
