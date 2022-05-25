package sample.FXML_Pages;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import sample.Buget;
import sample.FXMLSceneChanger;

import java.net.URL;
import java.util.ResourceBundle;


public class ManagerBugetPage implements Initializable {

    @FXML AnchorPane rootPane;
    @FXML TextField tfBuget;
    @FXML TextField tfNumeCV;
    @FXML TextField tfValoare;
    @FXML ComboBox<String> cb;
    @FXML TableView<Buget> tableBuget;
    @FXML TableColumn<Buget,String> tcNumeCV;
    @FXML TableColumn<Buget,String> tcTip;
    @FXML TableColumn<Buget, String> tcSuma;


    float bugetCurrent = 0;

    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        cb.getItems().addAll("Venit","Cheltuieli");

        tcNumeCV.setCellValueFactory(new PropertyValueFactory<Buget,String>("numeTipBuget"));
        tcTip.setCellValueFactory(new PropertyValueFactory<Buget,String>("TipBuget"));
        tcSuma.setCellValueFactory(new PropertyValueFactory<Buget,String>("StringSuma"));
    }

    public void AdaugaVC()
    {

        Buget buget = new Buget(tfNumeCV.getText(),cb.getValue(),Float.parseFloat(tfValoare.getText()));
        tableBuget.getItems().addAll(buget);

        if(cb.getValue().equals("Venit")) bugetCurrent += Float.parseFloat(tfValoare.getText());
        if(cb.getValue().equals("Cheltuieli")) bugetCurrent -= Float.parseFloat(tfValoare.getText());
        if(bugetCurrent <0) bugetCurrent = 0;
        tfBuget.setText(String.valueOf(bugetCurrent));
    }

    public void GoToBack() throws Exception {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/Main", rootPane.getScene());
    }
}
