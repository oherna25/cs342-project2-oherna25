
public class gameLogic {

	private int boardArray[][];
	int empty = 0;
	int player1 = 1;
	int player = 2;
	
	public gameLogic() {
		// TODO Auto-generated constructor stub
		
		boardArray = new int[7][6];
		for (int i = 0; i < 7; i++) {
			
			for (int j = 0; j < 6; j++) {
				boardArray[i][j] = empty;
				
			}
		} // end of loop
	}
	
	public boolean checkwin() {
		
		int player2count = 0;
		int player1count = 0;
		for ( int i = 0; i < 7; i++) {
			for ( int j = 0; j < 6; j++) {
				if(boardArray[i][j] == 1) {
					player1count++;
				}
				if(boardArray[i][j] == 2) {
					player2count++;
				}
			}
			if (player1count == 4 || player2count == 4) {
				return true;
			}
			player1count = 0;
			player2count = 0;
			
		}
		return false;
	}
	public boolean isValidMove(int col) {
		
	
		int empty_count = 6;
		
		if(boardArray[col][0] != 0) {
			return false;
		}
		for (int i = 0; i < 6; i++) {
			
			if( boardArray[col][i] == 0 ) {
				empty_count++;
			}
		}
		if (empty_count == 0) {
			return false;
		}
		
		return true;
	}
	public void updateArray(int col, int row, int player) {
		
		System.out.println("updateArray");
		boardArray[col][row] = player;
		System.out.println("updated array: " + boardArray[col][row]);
		
		
	}

	public int[][] getBoardArray() {
		return boardArray;
	}

	public void setBoardArray(int boardArray[][]) {
		this.boardArray = boardArray;
	}
	


}
