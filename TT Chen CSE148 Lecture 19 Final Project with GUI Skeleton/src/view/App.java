package view;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.College;

public class App extends Application {
	private final int STUDENTBAG_SIZE = 100;
	private final int TEXTBOOKBAG_SIZE = 50;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		College college = new College(STUDENTBAG_SIZE, TEXTBOOKBAG_SIZE);
		// create a menuBar
		MenuBar menuBar = new MenuBar();
		// create a menu
		Menu fileMenu = new Menu("File");
		// create a menuItem
		MenuItem exitMenuItem = new MenuItem("Exit");
		// add menuItem to the menu
		fileMenu.getItems().add(exitMenuItem);
		// add menu to the memuBar;
		menuBar.getMenus().add(fileMenu);

		exitMenuItem.setOnAction(e -> {
			college.saveAll();
			Platform.exit();
			System.exit(0);
		});
		
		BorderPane root = new BorderPane();
		// set menuBar to the top region of the borderPane
		root.setTop(menuBar);

		Scene scene = new Scene(root, 800, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
