package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    private ComboBox<String> moodPicker;

    @FXML
    private Button button;

    @FXML
    private TextField timeTextfield;

    @FXML
    void showCoffee(ActionEvent event) {
        String chosen = moodPicker.getValue();

        // change chosen string into int
        // awful mood equals 0
        // awesome mood equals 4
    }

    @FXML
    void initialize(){
        moodPicker.getItems().addAll(Main.moods);
        // it should light up why does it not light up
        // wtf is initialize anyway
    }

}
