package boardgame;

public class Board {
	
	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;
	
	public Board(Integer rows, Integer columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getColumns() {
		return columns;
	}
	
	public Piece piece(Integer row, Integer column) {
		if(!positionExists(row, column)) { //if false
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) { //sobrecarga do método
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " +position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	//para saber se uma posição existe, ela deve estar dentro do tabuleiro
	private Boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;//rows e columns devem ser maior do que 0 e menor do que a quantidade de rows e columns do tabuleiro
	} //a posição será retornada
	
	public Boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public Boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
}
