package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label messageLabel;

    @FXML
    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Hardcoded login for demo
        if (username.equals("admin") && password.equals("1234")) {
            try {
                SceneController.switchScene((Stage) usernameField.getScene().getWindow(), "/fxml/dashboard.fxml");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            messageLabel.setText("Invalid username or password!");
        }
    }

    private static final Logger LOGGER = Logger.getLogger(LoginController.class.getName());
    @FXML
    public void goToRegister() {
        try {
            SceneController.switchScene(
                    (Stage) usernameField.getScene().getWindow(),
                    "/fxml/Register.fxml");
        }
        catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Could not open Register page");
            alert.setContentText(e.getMessage());
            alert.showAndWait();

        }
    }
}
