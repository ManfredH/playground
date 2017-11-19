package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController {
	
	@FXML
	private Button btnHello;
	
	@FXML
	private TextArea taTextArea;
	
	public void sayHello(ActionEvent event) {
		System.out.println(event.getSource());
		taTextArea.appendText("Hello world ");
				
	}

}
