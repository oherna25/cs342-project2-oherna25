import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Board extends GridPane{

	public GridPane board;
	

	
	
	
	public Board() {
		// TODO Auto-generated constructor stub
		board = new GridPane();
		for ( int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++ ) {
				board.add(new Button("a button"), i, j);
			}
		}
		
		
	}
	
	
	
	
	
	

	

}
