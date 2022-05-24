package sample.FXML_Pages;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sample.FXMLSceneChanger;
import sample.Main;
import sample.Sarcina;

import java.time.format.DateTimeFormatter;

public class AdaugaSarcinaPage {

    @FXML AnchorPane rootPane;
    @FXML TextField tfSarcina;
    @FXML DatePicker dpTermenLimita;

    public void AdaugaSarcina() throws Exception {
        Sarcina s = new Sarcina(tfSarcina.getText(), dpTermenLimita.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), false);
        Main.AdaugaSarcina(s);
        //for(Sarcina sar : Main.listaSarcini) System.out.print(sar.getNumeSarcina());
        new FXMLSceneChanger().SwitchScene("FXML_Pages/ListaSarciniPage", rootPane.getScene());
    }

    public void GoToBack() throws Exception {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/ListaSarciniPage", rootPane.getScene());
    }
}
