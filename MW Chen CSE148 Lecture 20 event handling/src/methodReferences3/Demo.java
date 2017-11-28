package methodReferences3;

import javafx.application.Application;
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
		Button btn1 = new Button("Btn 1");
		
		// method references
		btn1.setOnAction(new MyEventHandler(messageLbl) :: handle);
		
		Button btn2 = new Button("Btn 2");
		btn2.setOnAction(new MyEventHandler(messageLbl) :: handle2);

		HBox pane1 = new HBox(20);
		pane1.setAlignment(Pos.CENTER);
		pane1.getChildren().addAll(btn1,btn2);

		VBox root = new VBox(20);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(pane0, pane1);

		Scene scene = new Scene(root, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	// private inner class
	private class MyEventHandler implements EventHandler{
		private Label messageLbl;
		
		public MyEventHandler(Label lbl) {
			messageLbl = lbl;
		}

		@Override
		public void handle(Event event) {
			messageLbl.setText("Btn 1 is clicked!");
		}

		public void handle2(Event event) {
			messageLbl.setText("Btn 2 is clicked!");
		}
	}

}



