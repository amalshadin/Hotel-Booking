package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label messageLabel;

    @FXML
    public void handleRegister() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (!username.isEmpty() && !password.isEmpty()) {
            messageLabel.setText("Registration successful! Go back to login.");
        } else {
            messageLabel.setText("Please fill in all fields.");
        }
    }

    @FXML
    public void goToLogin() {
        try {
            SceneController.switchScene((Stage) usernameField.getScene().getWindow(), "/fxml/login.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
