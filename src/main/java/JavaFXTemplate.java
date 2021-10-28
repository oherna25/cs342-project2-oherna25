

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFXTemplate extends Application {
	
	Scene startup_screen ;
	Scene coldWar;
	Group main;
	Board board;
	int row;
	int column;
	VBox coldwarCont;
	Button start;
	BackgroundImage sovietBG = new BackgroundImage ( new Image("sovietvusa.jpg", 700,700, false, true), BackgroundRepeat.REPEAT, 
													BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);

	VBox mainRoot;
	//Game game;
	
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Welcome to Connect Four!");
		
		// main group for the scene with the board

		board = new Board();
		//game = new Game();

		// creates menubar
		MenuBar menuBar = new MenuBar();
		Menu gamePlay = new Menu("Game Play");
		Menu themes = new Menu("Themes");
		Menu options = new Menu("Options");
		
		

		MenuItem reverse = new MenuItem("Reverse Move");
		gamePlay.getItems().add(reverse);
		
		MenuItem theme1 = new MenuItem("Original Theme");
		MenuItem theme2 = new MenuItem("Cold war Theme");
		MenuItem theme3 = new MenuItem("Weeb Theme");
		themes.getItems().addAll(theme1, theme2, theme3);
		
		
		MenuItem instructions = new MenuItem("How to play");
		MenuItem newGame = new MenuItem("Start new game");
		MenuItem exit = new MenuItem("exit");
		options.getItems().addAll(instructions, newGame, exit);
		
		menuBar.getMenus().addAll(gamePlay, themes, options);
		
		
		
		
		

		
		
		Label label1 = new Label("Welcome screen");
		label1.setFont(new Font("Time new Roman", 20));
		Label statusLabel = new Label(" ");
		start = new Button("start game");
		VBox screen1 = new VBox(label1, start);
		screen1.setAlignment(Pos.CENTER);
		//screen1.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
		startup_screen = new Scene(screen1, 700, 700);
	
		
		mainRoot = new VBox( menuBar, board);
		mainRoot.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
		
		mainRoot.setAlignment(Pos.CENTER);
		coldwarCont = new VBox(menuBar, board, statusLabel);
		coldwarCont.setBackground(new Background(sovietBG));
		coldWar = new Scene(coldwarCont, 700,700);
		
		Scene main_window = new Scene(mainRoot, 700,700);
		
		primaryStage.setScene(main_window);
		primaryStage.show();
	

		
		start.setOnAction (new EventHandler<ActionEvent> () {
			public void handle(ActionEvent e) {
				primaryStage.setScene(main_window);
			}
			
		});
		
		theme2.setOnAction(e -> {
			primaryStage.setScene(coldWar);
		});
	
	}
}

	

	


	
	
	


