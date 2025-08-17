package com.example.javafx;

import com.example.javafx.gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button btTest;

    @FXML
    public void onButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
        System.out.println("Button clicked!");

        Alerts.showCustomAlert("Alert Title", "Alert Header", "This is a custom alert message.", AlertType.INFORMATION);

    }

}
