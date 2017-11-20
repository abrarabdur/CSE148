package p1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void init() {
		// create the bags
//		bag1.load();
//		bag2.load();
//		bag3.load();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		double newGpa = 0.0;
		// 1st set of controls
		Label nameLbl = new Label("Name");
		nameLbl.setPrefSize(150, 50);
		nameLbl.setAlignment(Pos.CENTER_RIGHT);
		TextField nameField = new TextField();
		nameField.setPromptText("Name");

		// 2nd set of controls
		Label phoneLbl = new Label("Very very long Phone");
		phoneLbl.setPrefSize(150, 50);
		phoneLbl.setAlignment(Pos.CENTER_RIGHT);
		TextField phoneField = new TextField();
		phoneField.setPromptText("Phone");

		// 3rd set of controls
		Button okBtn = new Button("OK");
		Button exitBtn = new Button("EXIT");
		Button nextBtn = new Button("NEW");

		// 1st container
		HBox pane1 = new HBox(30);
		pane1.getChildren().addAll(nameLbl, nameField);
		pane1.setAlignment(Pos.CENTER);

		// 2nd container
		HBox pane2 = new HBox(30);
		pane2.getChildren().addAll(phoneLbl, phoneField);
		pane2.setAlignment(Pos.CENTER);

		// 3rd container
		HBox pane3 = new HBox(30);
		pane3.getChildren().addAll(okBtn, exitBtn, nextBtn);
		pane3.setAlignment(Pos.CENTER);

		// TextArea control
		TextArea displayArea = new TextArea();
		
		nextBtn.setOnAction(new EventHandler() {

			@Override
			public void handle(Event event) {
				System.out.println("HI");
			}
			
		});

		okBtn.setOnAction(e -> {
			// whatever in here will be invoked when button is clicked
			String name = nameField.getText();
			String phone = phoneField.getText();
//			displayArea.appendText(name + ": " + phone + "\n");
			nameField.clear();
			phoneField.clear();
			Person person = new Person(name, phone);
			displayArea.appendText(newGpa + " " + person.toString() );
		});
		
		exitBtn.setOnAction(e -> {
//			bag1.save();
//			bag2.save();
//			bag3.save();
			Platform.exit();
		});

		// parent container
		VBox pane = new VBox(20);
		pane.getChildren().addAll(pane1, pane2, pane3, displayArea);
		pane.setAlignment(Pos.CENTER);

		// add the container to the scene
		Scene scene = new Scene(pane, 500, 400);

		// add the scene to the primaryStage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hey My First JavaFX Program!");

		// request display on the screen
		primaryStage.show();
		
		

	}

}
