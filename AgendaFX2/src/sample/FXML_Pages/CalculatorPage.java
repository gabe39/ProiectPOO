package sample.FXML_Pages;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.AnchorPane;
import javafx.util.converter.NumberStringConverter;
import sample.FXMLSceneChanger;
import sample.Main;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

public class CalculatorPage implements Initializable {

    @FXML TextField nr1;
    @FXML TextField nr2;
    @FXML TextField rezultat;
    @FXML AnchorPane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        nr1.setTextFormatter(new TextFormatter<>(new NumberStringConverter(".0"))); // Seteaza campul de text sa accepte doar numere si sa adauge ".0" la sfarsitul numerelor (1)
        nr2.setTextFormatter(new TextFormatter<>(new NumberStringConverter(".0"))); //(1)
    }

    public void Aduna()
    {
        if(!nr1.getText().equals("") && !nr2.getText().equals("")) // Verifica daca campurile nu sunt goale (2)
        {
            float calcul = Float.parseFloat(nr1.getText()) + Float.parseFloat(nr2.getText()); //Calculeaza rezultatul si converteste din tip String in tip Float (3)
            rezultat.setText(String.valueOf(calcul)); //Seteaza textul campului rezultat si converteste din Tip Float in tip String (4)
        }
    }

    public void Scade()
    {
        if(!nr1.getText().equals("") && !nr2.getText().equals("")) // (2)
        {
            float calcul = Float.parseFloat(nr1.getText()) - Float.parseFloat(nr2.getText()); //(3)
            rezultat.setText(String.valueOf(calcul)); //(4)
        }
    }

    public void Inmulteste()
    {
        if(!nr1.getText().equals("") && !nr2.getText().equals("")) //(2)
        {
            float calcul = Float.parseFloat(nr1.getText()) * Float.parseFloat(nr2.getText()); //(3)
            rezultat.setText(String.valueOf(calcul)); //(4)
        }
    }
    public void Imparte()
    {
        if(!nr1.getText().equals("") && !nr2.getText().equals("")) //(2)
        {
            float calcul = Float.parseFloat(nr1.getText()) / Float.parseFloat(nr2.getText()); //(3)
            rezultat.setText(String.valueOf(calcul)); //(4)
        }
    }

    public void ReseteazaCampurile() //Goleste campurile de text
    {
        nr1.setText("");
        nr2.setText("");
        rezultat.setText("");
    }

    //Metoda care schimba documentul FXML/pagina interfetei
    public void GoToBack() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/Main", rootPane.getScene());
    }

}
