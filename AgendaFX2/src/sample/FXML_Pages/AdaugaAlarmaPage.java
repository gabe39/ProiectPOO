package sample.FXML_Pages;

import javafx.fxml.FXML;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sample.Alarma;
import sample.FXMLSceneChanger;
import sample.Main;

public class AdaugaAlarmaPage {

    @FXML AnchorPane rootPane;
    @FXML MenuButton mbRep;
    @FXML TextField tfNumeAlarma;
    @FXML TextField tfOra; @FXML TextField tfMinut;
    @FXML CheckMenuItem repLuni;  @FXML CheckMenuItem repMarti;
    @FXML CheckMenuItem repMiercuri;  @FXML CheckMenuItem repJoi;  @FXML CheckMenuItem repVineri;
    @FXML CheckMenuItem repSambata;  @FXML CheckMenuItem repDuminica;

    public void GoToBack() throws Exception {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/Main", rootPane.getScene());
    }

    public void AdaugaAlarma()throws Exception
    {
        StringBuilder sb = new StringBuilder();

        if(repLuni.isSelected()) sb.append("Lun, ");
        if(repMarti.isSelected()) sb.append("Mar, ");
        if(repMiercuri.isSelected()) sb.append("Mie, ");
        if(repJoi.isSelected()) sb.append("Joi, ");
        if(repVineri.isSelected()) sb.append("Vin, ");
        if(repSambata.isSelected()) sb.append("Sam, ");
        if(repDuminica.isSelected()) sb.append("Dum ");

        String zile = sb.toString();
        Alarma al = new Alarma(tfNumeAlarma.getText(),tfOra.getText()+":"+tfMinut.getText(),zile);
        Main.AdaugaAlarma(al);
        new FXMLSceneChanger().SwitchScene("FXML_Pages/AlarmsPage", rootPane.getScene());
    }

}
