package intro1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label messageLbl = new Label();
		HBox pane0 = new HBox(20);
		pane0.setAlignment(Pos.CENTER);
		pane0.getChildren().add(messageLbl);
		Button btn1 = new Button("Btn 1");
		
		// lambda expression
		// functional programming
		btn1.setOnAction(i -> {
			messageLbl.setText("Btn 1 is clicked!");
		});
		
		
		HBox pane1 = new HBox(20);
		pane1.setAlignment(Pos.CENTER);
		pane1.getChildren().add(btn1);
		
		VBox root = new VBox(20);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(pane0, pane1);
		
		Scene scene = new Scene(root, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	

}
