package customEventHandler2;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MyEventHandler implements EventHandler {
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
	
	public void handle2(Event event) {
		txtArea.appendText("Hi, " + btn.getText() + " is clicked!");
	}


}
