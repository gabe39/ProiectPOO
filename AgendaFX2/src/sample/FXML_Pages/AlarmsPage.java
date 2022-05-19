package sample.FXML_Pages;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import sample.Alarma;
import sample.FXMLSceneChanger;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class AlarmsPage implements Initializable {

    @FXML AnchorPane rootPane;
    @FXML TableView<Alarma> tabelAlarme;
    @FXML TableColumn<Alarma, String> tcNumeAlarma;
    @FXML TableColumn<Alarma, String> tcRepetareZile;
    @FXML TableColumn<Alarma, String> tcOra;

    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        tcNumeAlarma.setCellValueFactory(new PropertyValueFactory<Alarma,String>("NumeAlarma"));
        tcRepetareZile.setCellValueFactory(new PropertyValueFactory<Alarma,String>("Zile"));
        tcOra.setCellValueFactory(new PropertyValueFactory<Alarma,String>("Ora"));


        tabelAlarme.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tabelAlarme.getItems().setAll(Main.alarme);
    }

    public void StergeAlarma()
    {
        ObservableList<Alarma> liniiSelectate, toateAlarmele;
        toateAlarmele = tabelAlarme.getItems();

        liniiSelectate = tabelAlarme.getSelectionModel().getSelectedItems();

        for(Alarma a: liniiSelectate) Main.StergeAlrama(a);
        toateAlarmele.removeAll(liniiSelectate);
    }

    public void GoBackToMain() throws Exception {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/Main", rootPane.getScene());
    }
}
