package sample.FXML_Pages;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import sample.FXMLSceneChanger;

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

    public void GoToAlarms() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/AlarmsPage",rootPane.getScene());
    }

    public void GoToEvenimente() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/EvenimentsPage",rootPane.getScene());
    }

    public void GoToListaSarcini() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/ListaSarciniPage",rootPane.getScene());
    }
    //↑

    //Metode care schimba/afiseaza o imagine in functie de pozitia cursorului pe butoane
    //↓
    public void EmptyGif()
    {
        gifView.setImage(null);
    }

    public void ContactGif()
    {
        Image imGif = new Image("AdaugaContact.gif");
        gifView.setImage(imGif);
    }
    public void ListContactGif()
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

    public void AlarmGif()
    {
        Image imGif = new Image("Alarma.gif");
        gifView.setImage(imGif);
    }

    public void EvenimenteGif()
    {
        Image imGif = new Image("Evenimente.gif");
        gifView.setImage(imGif);
    }
    public void ListaSarciniGif()
    {
        Image imGif = new Image("ListaSarcini.gif");
        gifView.setImage(imGif);
    }
    //↑
}
