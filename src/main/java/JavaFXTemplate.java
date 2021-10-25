import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXTemplate extends Application {
	
	Scene startup_screen ;
	Group root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Welcome to Connect Four!");
		root = new Group();
		MenuBar menuBar = new MenuBar();
		Menu gamePlay = new Menu("Game Play");
		menuBar.getMenus().add(gamePlay);
		MenuItem reverse = new MenuItem("Reverse reverse");
		gamePlay.getItems().add(reverse);
		
		VBox menu = new VBox(menuBar);
		
		
		Label label1 = new Label("Welcome screen");
		Button start = new Button("start game");
		VBox screen1 = new VBox(20);
		screen1.getChildren().addAll(label1, start);
		startup_screen = new Scene(menu, 700, 700);
		
		
		VBox main_screen = new VBox(20);
		
		Scene main = new Scene(main_screen, 700,700);
		primaryStage.setScene(startup_screen);
		primaryStage.show();
	}

}
