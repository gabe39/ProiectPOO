package sample.FXML_Pages;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import sample.Contact;
import sample.FXMLSceneChanger;
import sample.Main;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.concurrent.TimeUnit;

public class addContactPageController {

    @FXML AnchorPane rootPane;
    @FXML TextField campNume;
    @FXML TextField campPrenume;
    @FXML TextField campAdresa;
    @FXML TextField campTelefon;
    @FXML TextField campTelefonAcasa;
    @FXML Label notificare;


    public void GoBackToMain() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/Main",rootPane.getScene());
    }


    public void AdaugaContact()
    {
        Contact persoana = new Contact(campNume.getText(),campPrenume.getText(),campAdresa.getText(),campTelefon.getText(),campTelefonAcasa.getText());
        notificare.setText("Contactul a fost adaugat cu succes!");
        PauseTransition pause = new PauseTransition(Duration.seconds(0.25));
        pause.setOnFinished(event ->
        {
            try
            {
                new FXMLSceneChanger().SwitchScene("FXML_Pages/Main",rootPane.getScene());
            }
            catch (IOException ex)
            {
                throw new UncheckedIOException(ex);
            }
        });
        pause.play();

        Main.AdaugaContactInAgenda(persoana);
    }


}
