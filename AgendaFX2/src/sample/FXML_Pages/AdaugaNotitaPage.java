package sample.FXML_Pages;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sample.Main;
import sample.Notita;

public class AdaugaNotitaPage  {

    @FXML public  TextField tfTitluNotita;
    @FXML public  TextArea taContinutNotita;
    @FXML public  Button btAfiseaza;

    @FXML AnchorPane rootPane;

    public void CreeazaNotita() throws  Exception
    {
        String pattern = "dd/MM/yyyy HH:mm";
        Date dataAzi = Calendar.getInstance().getTime();
        DateFormat df = new SimpleDateFormat(pattern);

        Notita n = new Notita(tfTitluNotita.getText(),taContinutNotita.getText(), df.format(dataAzi));
        Main.AdaugaNotitaInCarnet(n);

        new Main().SwitchScene("FXML_Pages/NotesPage",rootPane.getScene());
    }

    public void Anuleaza() throws  Exception
    {
        new Main().SwitchScene("FXML_Pages/NotesPage",rootPane.getScene());
    }


}
