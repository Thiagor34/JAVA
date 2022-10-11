package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constrains;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{
	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private Label labelResult;
	
	
	@FXML
	private Button btSum;
	
	public void onBtSumAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtNumber1.getText());
			double number2 = Double.parseDouble(txtNumber2.getText());
			double sum = number1 + number2;
			labelResult.setText(String.format("%.2f", sum));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constrains.setTextFieldDouble(txtNumber1);
		Constrains.setTextFieldDouble(txtNumber2);
		Constrains.setTextFieldMaxLength(txtNumber1, 12);
		Constrains.setTextFieldMaxLength(txtNumber2, 12);
		
	}

}
 