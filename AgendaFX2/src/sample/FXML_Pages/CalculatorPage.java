package sample.FXML_Pages;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.NumberStringConverter;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

public class CalculatorPage implements Initializable {
    @FXML TextField nr1;
    @FXML TextField nr2;
    @FXML TextField rezultat;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        /*
        nr1.setTextFormatter(new TextFormatter<>(c ->
        {
            if (!c.getControlNewText().matches("\\d*")) return null;
            else return c;
        }
        ));

        nr2.setTextFormatter(new TextFormatter<>(c ->
        {
            if (!c.getControlNewText().matches("\\d*")) return null;
            else return c;
        }
        ));
        */

        nr1.setTextFormatter(new TextFormatter<>(new NumberStringConverter(".0")));
        nr2.setTextFormatter(new TextFormatter<>(new NumberStringConverter(".0")));
    }

    public void Aduna()
    {
        if(!nr1.getText().equals("") && !nr2.getText().equals(""))
        {
            float calcul = Float.parseFloat(nr1.getText()) + Float.parseFloat(nr2.getText());
            rezultat.setText(String.valueOf(calcul));
        }
    }

    public void Scade()
    {
        if(!nr1.getText().equals("") && !nr2.getText().equals(""))
        {
            float calcul = Float.parseFloat(nr1.getText()) - Float.parseFloat(nr2.getText());
            rezultat.setText(String.valueOf(calcul));
        }
    }

    public void Inmulteste()
    {
        if(!nr1.getText().equals("") && !nr2.getText().equals(""))
        {
            float calcul = Float.parseFloat(nr1.getText()) * Float.parseFloat(nr2.getText());
            rezultat.setText(String.valueOf(calcul));
        }
    }
    public void Imparte()
    {
        if(!nr1.getText().equals("") && !nr2.getText().equals(""))
        {
            float calcul = Float.parseFloat(nr1.getText()) / Float.parseFloat(nr2.getText());
            rezultat.setText(String.valueOf(calcul));
        }
    }

    public void ReseteazaCampurile()
    {
        nr1.setText("");
        nr2.setText("");
        rezultat.setText("");
    }

}
