package com.example.example;

import com.example.util.Alerts;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewController {

    @FXML
    private Button btTest;

    @FXML
    protected void onBtTestAction() {

        Alerts.showAlerts("Alert title", null, "Hello", Alert.AlertType.INFORMATION);
    }
}