package sample.FXML_Pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.Main;
import sample.Notita;

public class AdaugaNotitaPage {
    @FXML TextField tfTitluNotita;
    @FXML TextArea taContinutNotita;

    public void CreeazaNotita()
    {
        String pattern = "dd/MM/yyyy HH:mm";
        Date dataAzi = Calendar.getInstance().getTime();
        DateFormat df = new SimpleDateFormat(pattern);
        Notita n = new Notita(tfTitluNotita.getText(),taContinutNotita.getText(), df.format(dataAzi));
        Main.AdaugaNotitaInCarnet(n);
    }
}
