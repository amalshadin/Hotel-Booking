package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class SceneController {

    public static void switchScene(Stage stage, String fxmlPath) throws Exception {
        FXMLLoader loader = new FXMLLoader(SceneController.class.getResource(fxmlPath));
        if (loader.getLocation() == null) {
            throw new IOException("FXML file not found: " + fxmlPath);
        }

        Parent root = loader.load();
        Scene scene = new Scene(root);

        // Add CSS styling
        String cssPath = SceneController.class.getResource("/css/style.css").toExternalForm();
        scene.getStylesheets().add(cssPath);

        stage.setScene(scene);
        stage.show();
    }
}

