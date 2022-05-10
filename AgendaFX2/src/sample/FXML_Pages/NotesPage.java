package sample.FXML_Pages;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import sample.Contact;
import sample.Main;
import sample.Notita;

import java.net.URL;
import java.util.ResourceBundle;

public class NotesPage implements Initializable {

    @FXML AnchorPane rootPane;
    @FXML TableView tabelNotite;
    @FXML TableColumn<Notita,String> tcTitluNotita;
    @FXML TableColumn<Notita, String> tcDataCrearii;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tcTitluNotita.setCellValueFactory(new PropertyValueFactory<Notita,String>("TitluNotita"));
        tcDataCrearii.setCellValueFactory(new PropertyValueFactory<Notita,String>("dataCrearii"));

        tabelNotite.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tabelNotite.getItems().setAll(Main.carnetNotite);
    }

    public void GoBack() throws Exception
    {
        new Main().SwitchScene("FXML_Pages/Main",rootPane.getScene());
    }
}
