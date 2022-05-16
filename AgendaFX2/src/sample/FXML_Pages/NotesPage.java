package sample.FXML_Pages;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Contact;
import sample.Main;
import sample.Notita;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class NotesPage implements Initializable {

    @FXML AnchorPane rootPane;
    @FXML TableView<Notita> tabelNotite;
    @FXML TableColumn<Notita,String> tcTitluNotita;
    @FXML TableColumn<Notita, String> tcDataCrearii;
    @FXML Button btAfisare;
    @FXML Button btEditare;
    @FXML Button btAdaugare;
    //@FXML AdaugaNotitaPage adaugaNotitaPage;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        tcTitluNotita.setCellValueFactory(new PropertyValueFactory<Notita,String>("TitluNotita"));
        tcDataCrearii.setCellValueFactory(new PropertyValueFactory<Notita,String>("dataCrearii"));

        tabelNotite.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tabelNotite.getItems().setAll(Main.carnetNotite);
        ObservableList<Notita> liniiSelectate;
        liniiSelectate = tabelNotite.getSelectionModel().getSelectedItems();
        if(liniiSelectate.size() == 0)
        {
            btAfisare.setVisible(false);
            btEditare.setVisible(false);
        }
        else
        {
            btAfisare.setVisible(true);
            btEditare.setVisible(true);
        }

    }

    public void UpdateTable()
    {
        ObservableList<Notita> liniiSelectate;
        liniiSelectate = tabelNotite.getSelectionModel().getSelectedItems();
        if(liniiSelectate.size() != 1)
        {
            btAfisare.setVisible(false);
            btEditare.setVisible(false);
        }
        else
        {
            btAfisare.setVisible(true);
            btEditare.setVisible(true);
        }
    }

    public void StergeNotita()
    {
        ObservableList<Notita> liniiSelectate, toateNotitele;
        toateNotitele = tabelNotite.getItems();

        liniiSelectate = tabelNotite.getSelectionModel().getSelectedItems();

        for(Notita n: liniiSelectate) Main.StergeNotita(n);
        toateNotitele.removeAll(liniiSelectate);
        Main.AfiseazaNotite();
    }

    public void AdaugaNotitaPage() throws Exception
    {
        new Main().SwitchScene("FXML_Pages/AdaugaNotitaPage",rootPane.getScene());
    }

    public void AfiseazaNotita() throws Exception
    {
        ObservableList<Notita> liniiSelectate;
        liniiSelectate = tabelNotite.getSelectionModel().getSelectedItems();


        //adaugaNotitaPage.taContinutNotita.setEditable(false);
        //adaugaNotitaPage.tfTitluNotita.setEditable(false);

        for(Notita n: liniiSelectate)
        {
            //adaugaNotitaPage.taContinutNotita.setText(n.getTitluNotita());
            //adaugaNotitaPage.tfTitluNotita.setText(n.getTextNotita());
            AdaugaNotitaPage.SetTfTitluNotitaText(n.getTitluNotita());
            //System.out.print("\n"+n.getTitluNotita()); System.out.print("\n"+n.getTextNotita());
        }

        new Main().SwitchScene("FXML_Pages/AdaugaNotitaPage",rootPane.getScene());
    }

    public void GoBack() throws Exception
    {
        new Main().SwitchScene("FXML_Pages/Main",rootPane.getScene());
    }
}
