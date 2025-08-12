package controllers;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class DashboardController {
    @FXML
    public void logout() {
        try {
            SceneController.switchScene((Stage) new javafx.scene.control.Button().getScene().getWindow(), "/fxml/login.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
