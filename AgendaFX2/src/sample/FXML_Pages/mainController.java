package sample.FXML_Pages;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;

public class mainController
{

    @FXML
    AnchorPane rootPane;

    public void GoToAddContact(ActionEvent e) throws Exception
    {
        new Main().SwitchScene("FXML_Pages/addContactPageController",rootPane.getScene());
    }

    public void GoToListaContacte(ActionEvent e) throws Exception
    {
        new Main().SwitchScene("FXML_Pages/ListContactsPage",rootPane.getScene());
    }

    public void GoToCalculator() throws Exception
    {
        new Main().SwitchScene("FXML_Pages/CalculatorPage",rootPane.getScene());
    }

}
