package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import javafx.stage.Stage;

import java.io.IOException;

import java.util.ArrayList;

public class Main extends Application {

    public static ArrayList<Contact> agenda = new ArrayList<Contact>();
    public static ArrayList<Notita> carnetNotite = new ArrayList<Notita>();

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

    public static void AfiseazaAgenda()
    {
        for (Contact c : agenda)
        {
            c.Afisare();
        }
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
}
