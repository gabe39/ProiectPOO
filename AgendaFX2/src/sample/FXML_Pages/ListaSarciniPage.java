package sample.FXML_Pages;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import sample.Eveniment;
import sample.FXMLSceneChanger;
import sample.Main;
import sample.Sarcina;

import java.net.URL;
import java.util.ResourceBundle;

public class ListaSarciniPage {

    @FXML AnchorPane rootPane;
    @FXML TableView<Sarcina> tabelSarcini;
    @FXML TableColumn<Sarcina, String> tcSarcina;
    @FXML TableColumn<Sarcina, String> tcTermenLimita;
    @FXML TableColumn<Sarcina, Boolean> tcTerminatSarcina;


    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        tcSarcina.setCellValueFactory(new PropertyValueFactory<Sarcina,String>("NumeSarcina"));
        tcTermenLimita.setCellValueFactory(new PropertyValueFactory<Sarcina,String>("TermenLimita"));
        tcTerminatSarcina.setCellValueFactory(new PropertyValueFactory<Sarcina, Boolean>("TerminatSarcina"));
        tcTerminatSarcina.setEditable(true);

        tabelSarcini.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        tabelSarcini.getItems().setAll(Main.listaSarcini);
    }

    public void StergeSarcinileTerminate()
    {
        ObservableList<Sarcina>toateSarcinile;
        toateSarcinile = tabelSarcini.getItems();

        for(Sarcina s: toateSarcinile)
        {
            if(s.getTerminatSarcina())
            {
                toateSarcinile.remove(s);
                Main.StergeSarcina(s);
            }
        }
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
