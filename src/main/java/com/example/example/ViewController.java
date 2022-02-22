package com.example.example;

import com.example.util.Alerts;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;

public class ViewController {

    @FXML
    private TextField txtFirstNumber;

    @FXML
    private TextField txtSecondNumber;

    @FXML
    private Label labelResult;

    @FXML
    private Button btSum;

    @FXML
    protected void onBtSumAction() {
        try {
            Locale.setDefault(Locale.US);
            double number1 = Double.parseDouble(txtFirstNumber.getText());
            double number2 = Double.parseDouble(txtSecondNumber.getText());
            double sum = number1 + number2;
            labelResult.setText(String.format("%.2f", sum));
        } catch (NumberFormatException e) {
            Alerts.showAlerts("Error", "Parse Error", e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}