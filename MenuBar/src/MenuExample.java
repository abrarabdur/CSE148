import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuExample extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Menu Example");
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 250);
		
		MenuBar menuBar = new MenuBar();
		menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
		root.setTop(menuBar);
		
		Menu fileMenu = new Menu("File");
		MenuItem newMenuItem = new MenuItem("New");
		MenuItem saveMenuItem = new MenuItem("Save");
		MenuItem exitMenuItem = new MenuItem("Exit");
		
		exitMenuItem.setOnAction(e -> {
//			Utilities.save();
			Platform.exit();
		});
		
		newMenuItem.setOnAction(e -> {
			System.out.println("New MenuItem clicked");
		});
		
		fileMenu.getItems().addAll(	newMenuItem, 
									saveMenuItem, 
									new SeparatorMenuItem(), 
									exitMenuItem);
		
		
		Menu cameraMenu = new Menu("Camera");
		CheckMenuItem cam1MenuItem = new CheckMenuItem("Show Camera 1");
		cam1MenuItem.setSelected(true);
		cameraMenu.getItems().add(cam1MenuItem);
		CheckMenuItem cam2MenuItem = new CheckMenuItem("Show Camera 2");
		cam2MenuItem.setSelected(true);
		cameraMenu.getItems().add(cam2MenuItem);
		
		Menu alarmMenu = new Menu("Alarm");
		
		ToggleGroup tGroup = new ToggleGroup();
		RadioMenuItem soundAlarmItem = new RadioMenuItem("Sound Alarm");
		soundAlarmItem.setToggleGroup(tGroup);
		
		RadioMenuItem stopAlarmItem = new RadioMenuItem("Alarm Off");
		stopAlarmItem.setToggleGroup(tGroup);
		stopAlarmItem.setSelected(true);
		
		alarmMenu.getItems().addAll(
				soundAlarmItem,
				stopAlarmItem,
				new SeparatorMenuItem()
				);
		
		Menu contingencyPlans = new Menu("Contingency Plans");
		contingencyPlans.getItems().addAll(
				new CheckMenuItem ("Self Destruct in T minus 50."),
				new CheckMenuItem ("Turn off the coffee machines."),
				new CheckMenuItem ("Run for your life")
				);
		
		alarmMenu.getItems().add(contingencyPlans);
		
		menuBar.getMenus().addAll(fileMenu, cameraMenu, alarmMenu);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
