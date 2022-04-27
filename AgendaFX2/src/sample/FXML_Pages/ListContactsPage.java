package sample.FXML_Pages;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import sample.Contact;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class ListContactsPage  {

    @FXML AnchorPane rootPane;

    @FXML TableView<Contact> tabelContacte;
    @FXML TableColumn<Contact,String> tcNume;
    @FXML TableColumn<Contact,String> tcPrenume;
    @FXML TableColumn<Contact,String> tcAdresa;
    @FXML TableColumn<Contact,String> tcTelefon;
    @FXML TableColumn<Contact,String> tcTelefonAcasa;

    @FXML private void initialize(URL url, ResourceBundle resourceBundle)
    {
        tcNume.setCellValueFactory(new PropertyValueFactory<>("get_nume"));
        tcNume.setCellValueFactory(new PropertyValueFactory<>("get_prenume"));
        tcNume.setCellValueFactory(new PropertyValueFactory<>("get_adresa"));
        tcNume.setCellValueFactory(new PropertyValueFactory<>("get_telefon"));
        tcNume.setCellValueFactory(new PropertyValueFactory<>("get_telefonAcasa"));

        tabelContacte.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tabelContacte.getItems().setAll(Main.getAgenda());
        Main.AfiseazaAgenda();
    }

    public void GoBackToMain(ActionEvent e) throws Exception
    {
        new Main().SwitchScene("FXML_Pages/Main",rootPane.getScene());
    }

    public void GoToAddContact(ActionEvent e) throws Exception
    {
        new Main().SwitchScene("FXML_Pages/addContactPageController",rootPane.getScene());
    }
}
