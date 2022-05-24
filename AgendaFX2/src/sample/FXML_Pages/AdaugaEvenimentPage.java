package sample.FXML_Pages;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sample.Eveniment;
import sample.FXMLSceneChanger;
import sample.Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdaugaEvenimentPage {

    @FXML AnchorPane rootPane;
    @FXML TextField tfNumeEveniment;
    @FXML DatePicker dpDataEveniment;
    @FXML TextField tfOraEveniment;
    @FXML TextField tfMinutEveniment;

    public void AdaugaEveniment() throws  Exception
    {
        //LocalDate lc = ;
        Eveniment ev = new Eveniment(tfNumeEveniment.getText(), dpDataEveniment.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),tfOraEveniment.getText()+":"+tfMinutEveniment.getText());
        Main.AdaugaEveniment(ev);
        new FXMLSceneChanger().SwitchScene("FXML_Pages/EvenimentsPage", rootPane.getScene());
    }

    public void GoBack() throws Exception {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/Main", rootPane.getScene());
    }
}
