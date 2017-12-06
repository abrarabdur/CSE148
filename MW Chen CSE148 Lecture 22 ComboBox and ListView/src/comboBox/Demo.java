package comboBox;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Demo extends Application {
	private String state;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//<> generics
//		ArrayList<String> arrayList = new ArrayList<>();
//		arrayList.add("NEW YORK");
//		arrayList.add("NEW JERSEY");
		
		String[] data = {"NEW YORK", "NEW JERSEY"};
		
//		ObservableList<String> list = FXCollections.observableArrayList(Arrays.asList(data));
		ObservableList<String> list = FXCollections.observableArrayList();
		list.add("NEW YORK");
		list.add("NEW JERSEY");
		ComboBox<String> box = new ComboBox();
		box.setItems(list);
		
//		box.setOnAction(e -> {
//			state = box.getValue();
//		});
		
		box.valueProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				System.out.println(oldValue);
				System.out.println(newValue);
			}
			
		});
		
		HBox root = new HBox();
		root.setAlignment(Pos.CENTER);
		root.getChildren().add(box);
		primaryStage.setScene(new Scene(root, 300, 300));
		primaryStage.show();
	}

}
