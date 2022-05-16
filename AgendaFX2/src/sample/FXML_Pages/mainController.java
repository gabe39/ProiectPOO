package sample.FXML_Pages;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import sample.FXMLSceneChanger;
import sample.Main;

import java.io.IOException;

public class mainController
{

    //@FXML = se injecteaza numele variabilelor din documentul FXML
    @FXML AnchorPane rootPane;
    @FXML ImageView gifView;

    //Metode care schimba documentele FXML/paginile interfetei
    //↓
    public void GoToAddContact() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/addContactPageController",rootPane.getScene());
    }

    public void GoToListaContacte() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/ListContactsPage",rootPane.getScene());
    }

    public void GoToCalculator() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/CalculatorPage",rootPane.getScene());
    }

    public void GoToNotes() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/NotesPage",rootPane.getScene());
    }
    //↑

    //Metode care schimba/afiseaza o imagine in functie de pozitia cursorului pe butoane
    //↓
    public void EmptyGif()
    {
        gifView.setImage(null);
    }

    public void ContagtGif()
    {
        Image imGif = new Image("AdaugaContact.gif");
        gifView.setImage(imGif);
    }
    public void ListContagtGif()
    {
        Image imGif = new Image("ListaContacte.gif");
        gifView.setImage(imGif);
    }
    public void CalculatortGif()
    {
        Image imGif = new Image("Calculator.gif");
        gifView.setImage(imGif);
    }
    public void CarnetGif()
    {
        Image imGif = new Image("Carnet.gif");
        gifView.setImage(imGif);
    }
    //↑
}
