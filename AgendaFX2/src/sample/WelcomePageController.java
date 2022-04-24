package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WelcomePageController {

    @FXML
    Label welcomeLabel;


    public void DisplayName(String name)
    {
        welcomeLabel.setText("Welcome, "+name);
    }
}
