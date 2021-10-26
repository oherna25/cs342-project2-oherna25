import com.sun.prism.paint.Color;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderStrokeStyle;

public class gameButton extends Button {

	public gameButton() {
		// TODO Auto-generated constructor stub
		this.minHeight(200);
		this.minWidth(200);
		//this.setBackground(null);
		this.setStyle("-fx-border-width: 1; -fx-border-color: black;");

		this.setBackground(null);
		this.setText("-");
	}


	


}
