package com.example.example;

import com.example.util.Alerts;
import com.example.util.Constraints;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Constraints.setTextFieldDouble(txtFirstNumber);
        Constraints.setTextFieldDouble(txtSecondNumber);
        Constraints.setTextFieldMaxLength(txtFirstNumber,12);
        Constraints.setTextFieldMaxLength(txtSecondNumber, 12);
    }
}