package anonymousClass4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label messageLbl = new Label();
		HBox pane0 = new HBox(20);
		pane0.setAlignment(Pos.CENTER);
		pane0.getChildren().add(messageLbl);
		Button btn1 = new Button("OK Btn");
		Button btn2 = new Button("Cancel Btn");

		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				messageLbl.setText(btn1.getText() + "  is clicked!");
			}

		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				messageLbl.setText(btn2.getText() + "  is clicked!");
			}

		});

		HBox pane1 = new HBox(20);
		pane1.setAlignment(Pos.CENTER);
		pane1.getChildren().addAll(btn1, btn2);

		VBox root = new VBox(20);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(pane0, pane1);

		Scene scene = new Scene(root, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
