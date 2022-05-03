package sample.FXML_Pages;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import sample.Main;

public class NotesPage {

    @FXML AnchorPane rootPane;

    public void GoBack() throws Exception
    {
        new Main().SwitchScene("FXML_Pages/Main",rootPane.getScene());
    }
}
