package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import javafx.stage.Stage;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;

public class Main extends Application {

    private ArrayList<Contact> agenda = new ArrayList<Contact>();

    @Override
    public void start(Stage stage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML_Pages/Main.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Image icon = new Image("agendaIcon2.png");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setTitle("Agenda");
        stage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }

    public void AdaugaContactInAgenda(Contact c)
    {
        agenda.add(c);
        agenda.sort(Contact.ComparatorNumePrenume);
    }

    public void SwitchScene(String fxml, Scene scene) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml+".fxml"));
        Parent root = loader.load();
        scene.setRoot(root);
    }
}
