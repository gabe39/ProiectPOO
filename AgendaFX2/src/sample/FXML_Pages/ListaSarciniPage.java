package sample.FXML_Pages;

import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;
import sample.FXMLSceneChanger;
import sample.Main;
import sample.Sarcina;

import java.net.URL;
import java.util.ResourceBundle;

public class ListaSarciniPage implements Initializable {

    @FXML AnchorPane rootPane;
    @FXML TableView<Sarcina> tabelSarcini;
    @FXML TableColumn<Sarcina, String> tcSarcina;
    @FXML TableColumn<Sarcina, String> tcTermenLimita;
    @FXML TableColumn<Sarcina, String> tcTerminatSarcina;


    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        tcSarcina.setCellValueFactory(new PropertyValueFactory<Sarcina,String>("NumeSarcina"));
        tcTermenLimita.setCellValueFactory(new PropertyValueFactory<Sarcina,String>("TermenLimita"));
        tcTerminatSarcina.setCellValueFactory(new PropertyValueFactory<Sarcina, String>("StringTerminatSarcina"));

        tabelSarcini.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tabelSarcini.getItems().setAll(Main.listaSarcini);
    }

    public void StergeSarcinileTerminate()
    {
        ObservableList<Sarcina>toateSarcinile;
        toateSarcinile = tabelSarcini.getItems();

        for (Sarcina s : toateSarcinile)
        {
            if(s.getTerminatSarcina())
            {
                Main.StergeSarcina(s);
                toateSarcinile.removeAll(s);
            }
        }
    }

    public void SeteazaSarcinaTerminata()
    {
        ObservableList<Sarcina>sarciniSelecate;
        sarciniSelecate = tabelSarcini.getSelectionModel().getSelectedItems();
        for (Sarcina s : sarciniSelecate)
        {
            s.setTerminatSarcina(true);
        }
        tabelSarcini.getItems().setAll(Main.listaSarcini);
    }

    public void GoBackToMain() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/Main",rootPane.getScene());
    }

    public void GoToAddSarcina() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/AdaugaSarcinaPage",rootPane.getScene());
    }

}
