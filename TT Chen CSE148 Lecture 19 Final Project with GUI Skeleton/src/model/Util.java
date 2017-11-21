package model;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Util {
	public static void failureAlert(String message) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Alert!");
		alert.setHeaderText("Information Alert");
		alert.setContentText(message);
		alert.showAndWait();
	}

}
