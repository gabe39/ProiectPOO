package sample.FXML_Pages;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import sample.Contact;
import sample.Eveniment;
import sample.FXMLSceneChanger;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class EvenimentsPage implements Initializable
{
    @FXML AnchorPane rootPane;
    @FXML TableView<Eveniment> tabelEvenimente;
    @FXML TableColumn<Eveniment, String> tcNumeEveniment;
    @FXML TableColumn<Eveniment, String> tcData;
    @FXML TableColumn<Eveniment, String> tcOra;


    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        tcNumeEveniment.setCellValueFactory(new PropertyValueFactory<Eveniment,String>("NumeEveniment"));
        tcData.setCellValueFactory(new PropertyValueFactory<Eveniment,String>("DataEveniment"));
        tcOra.setCellValueFactory(new PropertyValueFactory<Eveniment,String>("OraEvenniment"));


        tabelEvenimente.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tabelEvenimente.getItems().setAll(Main.evenimente);
    }

    public void StergeEveniment()
    {
        ObservableList<Eveniment> liniiSelectate, toateEvenimentele;
        toateEvenimentele = tabelEvenimente.getItems();

        liniiSelectate = tabelEvenimente.getSelectionModel().getSelectedItems();

        for(Eveniment e: liniiSelectate) Main.StergeEveniment(e);
        toateEvenimentele.removeAll(liniiSelectate);
    }

    public void GoBackToMain() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/Main",rootPane.getScene());
    }

    public void GoToAddEveniment() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/AdaugaEvenimentPage",rootPane.getScene());
    }


}
