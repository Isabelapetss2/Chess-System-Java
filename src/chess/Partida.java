package chess;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import chess.pieces.Torre;

public class Partida {

	private Tabuleiro tabuleiro;

	public Partida() {
		tabuleiro = new Tabuleiro(8,8);
		
		setupInicial();
		
	}
	
	public PecaDeXadrez[][]getPieces(){
		PecaDeXadrez[][]peca = new PecaDeXadrez[tabuleiro.getRows()][tabuleiro.getColumns()];
		for(int i=0;i<tabuleiro.getRows();i++) {
			for(int j =0 ; j<tabuleiro.getColumns();j++) {
			peca[i][j] = (PecaDeXadrez)tabuleiro.piece(i,j);
			}
			
		} 
		return peca;
	}
	private void setupInicial() {
		tabuleiro.lugarDaPeça(new Torre(tabuleiro,Colors.BRANCO),new Posicao(3,4));
	}
	
}
