package sample.FXML_Pages;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sample.FXMLSceneChanger;

public class AdaugaSarcinaPage {

    @FXML AnchorPane rootPane;
    @FXML TextField tfSarcina;
    @FXML DatePicker dpTermenLimita;

    public void GoToBack() throws Exception {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/ListaSarciniPage", rootPane.getScene());
    }
}
