package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class MainController {

    @FXML
    private AnchorPane root;

    @FXML
    private GridPane gridPane;

    @FXML
    private ComboBox<?> moodPicker;

    @FXML
    private TextField timeTextfield;

    @FXML
    void showCoffee(ActionEvent event) {

    }

}
