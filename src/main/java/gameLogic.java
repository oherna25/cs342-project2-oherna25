
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

}
