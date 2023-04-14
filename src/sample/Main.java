package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class Main extends Application {

    static List<String> moods = new ArrayList<>();

    public static ComboBox<String> moodPicker = new ComboBox<>();

    public static TextField timeTextfield = new TextField();

    public static Button button = new Button();

    public static void main(String[] args) {
         launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        moods.add("Awesome");
        moods.add("Happy");
        moods.add("Alright");
        moods.add("Bad");
        moods.add("Awful");

        moodPicker.getItems().addAll(Main.moods);
        moodPicker.setOnAction(event -> {
            String chosen = moodPicker.getValue();
        });

        AnchorPane root = new AnchorPane();

        root.getChildren().addAll(timeTextfield, button, moodPicker);

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("coffee");
        primaryStage.show();
    }


}

