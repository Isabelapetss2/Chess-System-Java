package chess;

import boardgame.Peça;
import boardgame.Posicao;
import boardgame.Tabuleiro;
import chess.pieces.Rainha;
import chess.pieces.Rei;
import chess.pieces.Torre;

public class Partida {

	private Tabuleiro tabuleiro;

	public Partida() {
		tabuleiro = new Tabuleiro(8, 8);

		setupInicial();

	}

	public PecaDeXadrez[][] getPieces() {
		PecaDeXadrez[][] peca = new PecaDeXadrez[tabuleiro.getRows()][tabuleiro.getColumns()];
		for (int i = 0; i < tabuleiro.getRows(); i++) {
			for (int j = 0; j < tabuleiro.getColumns(); j++) {
				peca[i][j] = (PecaDeXadrez) tabuleiro.piece(i, j);
			}

		}
		return peca;
	}
	
	public PecaDeXadrez performChessMove(PosicaoXadrez sourcePosition, PosicaoXadrez targetPosition) {
		Posicao source = sourcePosition.toPosition();
		Posicao target = targetPosition.toPosition();
		validarPosicao(source);
		Peça capturedPiece = movimentoRealizado(source,target);
		return(PecaDeXadrez)capturedPiece;
	}
	


	
	private Peça movimentoRealizado(Posicao source,Posicao target) {
		Peça p = tabuleiro.removePeca(source);
		Peça capturedPiece = tabuleiro.removePeca(target);
		tabuleiro.lugarDaPeça(p,target);
		return capturedPiece;
	}

	private void placeNewPiece(char column, int row, PecaDeXadrez piece) {
		tabuleiro.lugarDaPeça(piece, new PosicaoXadrez(column, row).toPosition());
	}
	
	private void validarPosicao(Posicao position) {
		if(!tabuleiro.thereIsAPiece(position)) {
			throw new ChessException(" não há peças nessa posição!");
		}
	}

	private void setupInicial() {

		placeNewPiece('c', 1, new Torre(tabuleiro, Colors.BRANCO));
		placeNewPiece('c', 2, new Torre(tabuleiro, Colors.BRANCO));
		placeNewPiece('d', 2, new Torre(tabuleiro, Colors.BRANCO));
		placeNewPiece('e', 2, new Torre(tabuleiro, Colors.BRANCO));
		placeNewPiece('e', 1, new Torre(tabuleiro, Colors.BRANCO));
		placeNewPiece('d', 1, new Rei(tabuleiro, Colors.BRANCO));

		placeNewPiece('c', 7, new Torre(tabuleiro, Colors.PRETO));
		placeNewPiece('c', 8, new Torre(tabuleiro, Colors.PRETO));
		placeNewPiece('d', 7, new Torre(tabuleiro, Colors.PRETO));
		placeNewPiece('e', 7, new Torre(tabuleiro, Colors.PRETO));
		placeNewPiece('e', 8, new Torre(tabuleiro, Colors.PRETO));
		placeNewPiece('d', 8, new Rei(tabuleiro, Colors.PRETO));
	}

}
