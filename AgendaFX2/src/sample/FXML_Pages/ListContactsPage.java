package sample.FXML_Pages;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import sample.Contact;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class ListContactsPage implements Initializable {

    @FXML AnchorPane rootPane;

    @FXML TableView<Contact> tabelContacte;
    @FXML TableColumn<Contact,String> tcNume;
    @FXML TableColumn<Contact,String> tcPrenume;
    @FXML TableColumn<Contact,String> tcAdresa;
    @FXML TableColumn<Contact,String> tcTelefon;
    @FXML TableColumn<Contact,String> tcTelefonAcasa;

     public void initialize(URL url, ResourceBundle resourceBundle)
    {
        tcNume.setCellValueFactory(new PropertyValueFactory<Contact,String>("_nume"));
        tcPrenume.setCellValueFactory(new PropertyValueFactory<Contact,String>("_prenume"));
        tcAdresa.setCellValueFactory(new PropertyValueFactory<Contact,String>("_adresa"));
        tcTelefon.setCellValueFactory(new PropertyValueFactory<Contact,String>("_telefon"));
        tcTelefonAcasa.setCellValueFactory(new PropertyValueFactory<Contact,String>("_telefonAcasa"));

        tabelContacte.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tabelContacte.getItems().setAll(Main.agenda);
    }

    public void StergeContact()
    {
        ObservableList<Contact> liniiSelectate, toateContactele;
        toateContactele = tabelContacte.getItems();

        liniiSelectate = tabelContacte.getSelectionModel().getSelectedItems();

        for(Contact c: liniiSelectate) Main.StergeContact(c);
        toateContactele.removeAll(liniiSelectate);

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
