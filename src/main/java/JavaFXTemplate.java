import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXTemplate extends Application {
	
	Scene startup_screen ;
	Group main;
	Board board;
	int row;
	int column;
	Game game;
	
	
	
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
		main = new Group();
		game = new Game();

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
		
		
		
		
		
		VBox mainRoot;
		VBox menu = new VBox(menuBar);
		
		
		Label label1 = new Label("Welcome screen");
		Button start = new Button("start game");
		VBox screen1 = new VBox(20);
		screen1.getChildren().addAll(label1, start);
		
		startup_screen = new Scene(menu ,700, 700);
		startup_screen.setFill(Color.rgb(1,1,1));
		
		VBox main_screen = new VBox();
		//main_screen.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
		board = new Board();
	

		
		
		mainRoot = new VBox( menuBar, board);
		mainRoot.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
		
		mainRoot.setAlignment(Pos.CENTER);
		
		
		
		Scene main_window = new Scene(mainRoot, 700,700, Color.BLACK);
		
		primaryStage.setScene(main_window);
		primaryStage.show();
	}
	

	}
	
	
	


