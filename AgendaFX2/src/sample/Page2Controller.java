package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Page2Controller {

    @FXML
    TextField nameField;

    public void SwitchToMain(ActionEvent event) throws IOException
    {
        Stage stage;
        Scene scene;
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void Go(ActionEvent event) throws IOException
    {
        Stage stage;
        Scene scene;
        Parent root;

        String name = nameField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("WelcomePage.fxml"));
        root = loader.load();

        WelcomePageController welcomePageController = loader.getController();
        welcomePageController.DisplayName(name);

        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    
}
