package comboBox;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Demo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ObservableList<String> list = FXCollections.observableArrayList("A", "B", "C");
		ComboBox<String> box = new ComboBox<>();
		box.setItems(list);
		box.setOnAction(e -> {
			String item = (String) box.getValue();
			System.out.println(item);

		});

		HBox pane = new HBox();
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().add(box);
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
