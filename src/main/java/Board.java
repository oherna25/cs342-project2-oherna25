
import javafx.scene.Node;

import javafx.scene.layout.GridPane;

public class Board extends GridPane{

	
		gameButton current;
		gameButton empty_slot;
		int r;
		int col;
		gameLogic logic;
		
	
	
	public Board() {
		// TODO Auto-generated constructor stub
	
		this.setHgap(5);
		this.setVgap(5);
		this.setTranslateX(200);
		for ( int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++ ) {
				gameButton piece = new gameButton();
				piece.setOnAction(e->buttonClicked( piece ));
				this.add(piece, i, j);
				
			}
		}
		logic = new gameLogic();
		
		
	}

	private void buttonClicked(gameButton piece) {
		// TODO Auto-generated method stub
		current = piece;
		System.out.println("clicked on piece");
		col = GridPane.getColumnIndex(current);
		r = GridPane.getRowIndex(current);
		System.out.println("col: " + col + " row: " + r );
		this.play();
		//current.setStyle("-fx-background-color: red;");

		}
		
	
	
	private void play() {
		
		
		if (logic.isValidMove(col)) {
		System.out.println("validmove");
		this.getEmptySLot(logic.getBoardArray());
		this.logic.updateArray(this.getEmptySlotCol(), this.getEmptySlotRow(), 1);
		System.out.println(this.getEmptySlotCol() + " " + this.getEmptySlotRow());
		this.updatePiece(1);
		if (logic.checkwin()) {
			System.out.println("won");
		}
		}
	}
	
	
	
	void updatePiece( int player) {
		
		if ( player == 1) {
			empty_slot.setStyle("-fx-background-color: red;");
			
		}
		
		if (player == 2) {
			empty_slot.setStyle("-fx-background-color: blue;");
		}
	}
	
	void getEmptySLot(int[][] Array) {
		System.out.println("getEmptySlot");
		int row = 5;
	
		while (Array[col][row] != 0 && row >= 0) {
			row --;
			
		}
		System.out.println("row: " + row);
		/*
		for ( row = 5; row <= 0; row--) {
			
			if ( Array[col][row] == 0) {
				System.out.println("empty slot:" + Array[col][row]);
				break;
			}
		}
		
		*/
		
		
		for ( Node node : this.getChildren() ) {
			if(Board.getRowIndex(node) == row && Board.getColumnIndex(node) == col) {
				empty_slot = (gameButton) node;
				break;
			}
		}
	}
	
	public int getEmptySlotCol() {
		
		return Board.getColumnIndex(empty_slot);
	}
	
	public int getEmptySlotRow() {
		
		return Board.getRowIndex(empty_slot);
	}
 	
	
	
	
	

	

}
