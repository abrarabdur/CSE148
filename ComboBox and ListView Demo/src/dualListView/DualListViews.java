package dualListView;
import java.util.Arrays;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DualListViews extends Application {

  @Override
  public void start(Stage primaryStage) {
    BorderPane root = new BorderPane();
    Scene scene = new Scene(root, 400, 250);

    GridPane gridpane = new GridPane();
    gridpane.setPadding(new Insets(5));
    gridpane.setHgap(10);
    gridpane.setVgap(10);
    ColumnConstraints column1 = new ColumnConstraints(150, 150,
        Double.MAX_VALUE);
    ColumnConstraints column2 = new ColumnConstraints(50);
    ColumnConstraints column3 = new ColumnConstraints(150, 150,
        Double.MAX_VALUE);
    column1.setHgrow(Priority.ALWAYS);
    column3.setHgrow(Priority.ALWAYS);
    gridpane.getColumnConstraints().addAll(column1, column2, column3);

    Label coursesToTakeLbl = new Label("Courses to Take");
    GridPane.setHalignment(coursesToTakeLbl, HPos.CENTER);
    gridpane.add(coursesToTakeLbl, 0, 0);

    Label coursesTakingLbl = new Label("Courses Taking");
    gridpane.add(coursesTakingLbl, 2, 0);
    GridPane.setHalignment(coursesTakingLbl, HPos.CENTER);
String[] courses = {"CSE110", "CSE118", "CSE148", "CSE218", "CSE248", "CSE222"};
    // Courses to take
//    final ObservableList<String> candidates = FXCollections
//        .observableArrayList("Z", "A", "B", "C", "D");
final ObservableList<String> coursesToTakeList = FXCollections
.observableArrayList(Arrays.asList(courses));
    final ListView<String> coursesToTakeListView = new ListView<>(coursesToTakeList);
    gridpane.add(coursesToTakeListView, 0, 1);

    final ObservableList<String> coursesTakingList = FXCollections.observableArrayList();
    final ListView<String> coursesTakingListView = new ListView<>(coursesTakingList);
    gridpane.add(coursesTakingListView, 2, 1);

    Button sendRightButton = new Button(" > ");
    sendRightButton.setOnAction((ActionEvent event) -> {
      String potential = coursesToTakeListView.getSelectionModel()
          .getSelectedItem();
      if (potential != null) {
        coursesToTakeListView.getSelectionModel().clearSelection();
        coursesToTakeList.remove(potential);
        coursesTakingList.add(potential);
       
        System.out.println(coursesToTakeList.toString());
        System.out.println(coursesTakingList.toString());
      }
    });

    Button sendLeftButton = new Button(" < ");
    sendLeftButton.setOnAction((ActionEvent event) -> {
      String s = coursesTakingListView.getSelectionModel().getSelectedItem();
      if (s != null) {
        coursesTakingListView.getSelectionModel().clearSelection();
        coursesTakingList.remove(s);
        coursesToTakeList.add(s);
        System.out.println(coursesToTakeList.toString());
        System.out.println(coursesTakingList.toString());
      }
    });
    VBox vbox = new VBox(5);
    vbox.getChildren().addAll(sendRightButton, sendLeftButton);

    gridpane.add(vbox, 1, 1);
    root.setCenter(gridpane);

    GridPane.setVgrow(root, Priority.ALWAYS);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  public static void main(String[] args) {
    launch(args);
  }
}