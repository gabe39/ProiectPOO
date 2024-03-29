package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static ArrayList<Contact> agenda = new ArrayList<Contact>();
    public static ArrayList<Notita> carnetNotite = new ArrayList<Notita>();
    public static ArrayList<Eveniment> evenimente = new ArrayList<Eveniment>();
    public static ArrayList<Alarma> alarme = new ArrayList<Alarma>();
    public static ArrayList<Sarcina> listaSarcini = new ArrayList<Sarcina>();


    @Override
    public void start(Stage stage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML_Pages/Main.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Image icon = new Image("agendaIcon2.png");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setTitle("Agenda Electronica");
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void AdaugaContactInAgenda(Contact c)
    {
        agenda.add(c);
        agenda.sort(Contact.ComparatorNumePrenume);
    }

    public static void StergeContact (Contact c)
    {
        agenda.remove(c);
        agenda.sort(Contact.ComparatorNumePrenume);
    }

    public static void AdaugaNotitaInCarnet(Notita n)
    {
        carnetNotite.add(n);
        carnetNotite.sort(Notita.ComparatorTitlu);
    }
    public static void StergeNotita (Notita n)
    {
        carnetNotite.remove(n);
        carnetNotite.sort(Notita.ComparatorTitlu);
    }

    public static void AfiseazaNotite()
    {
        for (Notita n : carnetNotite)
        {
            n.Afisare();
        }
    }

    public static void AdaugaEveniment(Eveniment e)
    {
        evenimente.add(e);
        evenimente.sort(Eveniment.ComparatorOra);
    }
    public static void StergeEveniment (Eveniment e)
    {
        evenimente.remove(e);
        evenimente.sort(Eveniment.ComparatorOra);
    }

    public static void AdaugaAlarma(Alarma a)
    {
        alarme.add(a);
        alarme.sort(Alarma.ComparatorOraAlarma);
    }
    public static void StergeAlrama (Alarma a)
    {
        alarme.remove(a);
        alarme.sort(Alarma.ComparatorOraAlarma);
    }

    public static void AdaugaSarcina(Sarcina s)
    {
        listaSarcini.add(s);
        listaSarcini.sort(Sarcina.ComparatorTerminatSarcina);
    }
    public static void StergeSarcina (Sarcina s)
    {
        listaSarcini.remove(s);
        listaSarcini.sort(Sarcina.ComparatorTerminatSarcina);
    }

}
