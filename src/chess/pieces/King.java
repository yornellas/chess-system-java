package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

	@Override
	public Boolean[][] possibleMoves() {
		//temporário:
		Boolean[][] mat = new Boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}

}
