package innerClass3;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
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
		// btn1.setOnAction(event -> {
		// System.out.println("Hi");
		// });

		TextArea txtArea = new TextArea();
		
		btn1.setOnAction(new MyEventHandler(txtArea, btn1));
		txtArea.setMaxSize(200, 200);
		VBox pane = new VBox(50);
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(btn1, txtArea);

		Scene scene = new Scene(pane, 300, 300);

		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	// private inner class
	private class MyEventHandler implements EventHandler {
		private TextArea txtArea;
		private Button btn;

		public MyEventHandler(TextArea txtArea, Button btn) {
			this.txtArea = txtArea;
			this.btn = btn;
		}

		@Override
		public void handle(Event event) {
			txtArea.appendText("Hi, " + btn.getText() + " is clicked!");
		}

	}

}


