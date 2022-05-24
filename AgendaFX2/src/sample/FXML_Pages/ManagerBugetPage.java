package sample.FXML_Pages;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import sample.Buget;
import sample.Eveniment;
import sample.FXMLSceneChanger;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

class VenitCheltuieli
{
    String tipSumaBuget;
    String numeVenitCheltuieli;
    float suma;

    public VenitCheltuieli(String tipSumaBuget, String numeVenitCheltuieli, float suma) {
        this.tipSumaBuget = tipSumaBuget;
        this.numeVenitCheltuieli = numeVenitCheltuieli;
        this.suma = suma;
    }


    public String getNumeVenitCheltuieli() {
        return numeVenitCheltuieli;
    }

    public String getSuma() {
        return String.valueOf(suma);
    }

    public String getTipSumaBuget() {
        return this.tipSumaBuget;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public void setTipSumaBuget(String tipSumaBuget) {
        this.tipSumaBuget = tipSumaBuget;
    }

    public void setNumeVenitCheltuieli(String numeVenitCheltuieli) {
        this.numeVenitCheltuieli = numeVenitCheltuieli;
    }
}

public class ManagerBugetPage implements Initializable {

    @FXML AnchorPane rootPane;
    @FXML TextField tfBuget;
    @FXML TextField tfNumeCV;
    @FXML TextField tfValoare;
    @FXML ComboBox<String> cb;
    @FXML TableView<VenitCheltuieli> tableBuget;
    @FXML TableColumn<VenitCheltuieli,String> tcNumeCV;
    @FXML TableColumn<VenitCheltuieli,String> tcTip;
    @FXML TableColumn<VenitCheltuieli, String> tcSuma;
    Buget buget;

    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        cb.getItems().addAll("Venit","Cheltuieli");

        tcNumeCV.setCellValueFactory(new PropertyValueFactory<VenitCheltuieli,String>("NumeVenitCheltuieli"));
        tcTip.setCellValueFactory(new PropertyValueFactory<VenitCheltuieli,String>("TipSumaBuget"));
        tcSuma.setCellValueFactory(new PropertyValueFactory<VenitCheltuieli,String>("Suma"));
    }

    public void AdaugaVC()
    {
        float valoare = Integer.parseInt(tfValoare.getText());
        float cheltuieli = 0;
        float venit = 0;

        buget.setVenituri(venit); buget.setVenituri(cheltuieli);
        if(cb.getValue().equals("Venit")) venit += valoare;
        else if(cb.getValue().equals("Cheltuieli")) cheltuieli += valoare;

        VenitCheltuieli vc = new VenitCheltuieli(tfNumeCV.getText(),  cb.getValue(), valoare);
        tableBuget.getItems().addAll(vc);
    }

    public void GoToBack() throws Exception {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/Main", rootPane.getScene());
    }
}
