package uk.ac.cam.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        /*
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene secondScene = new Scene(fxmlLoader2.load());
        Stage secondStage = new Stage();
        secondStage.setScene(secondScene); // set the second scene
        secondStage.setTitle("Second Form");
        secondStage.show();
        */
    }

    public static void main(String[] args) {
        launch();
    }
}