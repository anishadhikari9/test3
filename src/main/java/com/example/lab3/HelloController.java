package com.example.lab3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.temporal.TemporalAmount;

public class thepizzastore {
    @FXML
    private TextField customerNameField;

    @FXML
    private TextField mobileNumberField;

    @FXML
    private CheckBox xlCheckBox;

    @FXML
    private CheckBox lCheckBox;

    @FXML
    private CheckBox mCheckBox;

    @FXML
    private TextField TotalAmount;

    @FXML
    private TextField toppingsField;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}