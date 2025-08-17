package com.example.javafx2;

import com.example.javafx2.util.Alerts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class ViewController {
    @FXML
    private TextField txtNumber1;

    @FXML
    private TextField txtNumber2;

    @FXML
    private Label labelResult;

    @FXML
    private Button btSum;

    @FXML
    public void onBtSumAction() {
        try {
            Locale.setDefault(Locale.US);
            double number1 = Double.parseDouble(txtNumber1.getText());
            double number2 = Double.parseDouble(txtNumber2.getText());
            double sum = number2 + number1;

            labelResult.setText(String.format("%.2f", sum));

            System.out.println("Button clicked!");
        } catch (NumberFormatException e) {
            Alerts.showCustomAlert("Error", "Parse Error", e.getMessage(), AlertType.ERROR);
        }

    }


}
