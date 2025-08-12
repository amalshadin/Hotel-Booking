package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class SceneController {
    public static void switchScene(Stage stage, String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(SceneController.class.getResource("/" + fxml));
        Scene scene = new Scene(loader.load());
        scene.getStylesheets().add(SceneController.class.getResource("/css/styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
