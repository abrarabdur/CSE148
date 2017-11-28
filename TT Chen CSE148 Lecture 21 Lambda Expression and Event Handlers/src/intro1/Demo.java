package intro1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn1 = new Button("BTN1");
		
		// -> means lambda expressions
		btn1.setOnAction(event -> {
			System.out.println("Hi");
		});
		
		TextArea txtArea = new TextArea();
		txtArea.setMaxSize(200, 200);
		VBox pane = new VBox(50);
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(btn1, txtArea);
		
		Scene scene = new Scene(pane, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
