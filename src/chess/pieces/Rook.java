package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}
	
	@Override
	public Boolean[][] possibleMoves() {
		//temporário:
		Boolean[][] mat = new Boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}

}
