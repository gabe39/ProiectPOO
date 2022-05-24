package sample.FXML_Pages;

import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;
import sample.FXMLSceneChanger;
import sample.Main;
import sample.Sarcina;

import java.net.URL;
import java.util.ResourceBundle;

public class ListaSarciniPage implements Initializable {

    @FXML AnchorPane rootPane;
    @FXML TableView<Sarcina> tabelSarcini;
    @FXML TableColumn<Sarcina, String> tcSarcina;
    @FXML TableColumn<Sarcina, String> tcTermenLimita;
    @FXML TableColumn<Sarcina, String> tcTerminatSarcina;
    @FXML Button btStergeSarcina; @FXML Button btTerminaSarcina;


    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        tcSarcina.setCellValueFactory(new PropertyValueFactory<Sarcina,String>("NumeSarcina"));
        tcTermenLimita.setCellValueFactory(new PropertyValueFactory<Sarcina,String>("TermenLimita"));
        tcTerminatSarcina.setCellValueFactory(new PropertyValueFactory<Sarcina, String>("StringTerminatSarcina"));

        tabelSarcini.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tabelSarcini.getItems().setAll(Main.listaSarcini);
        UpdateTabel();

    }

    public void UpdateTabel()
    {
        if(tabelSarcini.getItems().size() == 0)
        {
            btStergeSarcina.setVisible(false);
            btTerminaSarcina.setVisible(false);
        }
        else if(tabelSarcini.getItems().size() > 1)
        {
            btTerminaSarcina.setText("Termina Sarcinile");
            btStergeSarcina.setText("Sterge Sarcinile Terminate");
            btStergeSarcina.setVisible(true);
            btTerminaSarcina.setVisible(true);
        }
        else if(tabelSarcini.getItems().size() == 1)
        {
            btTerminaSarcina.setText("Termina Sarcina");
            btStergeSarcina.setText("Sterge Sarcina Terminata");
            btStergeSarcina.setVisible(true);
            btTerminaSarcina.setVisible(true);
        }
    }

    public void StergeSarcinileTerminate()
    {
        ObservableList<Sarcina>toateSarcinile;
        toateSarcinile = tabelSarcini.getItems();

        for (int i=0; i<toateSarcinile.size();i++)
        {
            if(toateSarcinile.get(i).getTerminatSarcina())
            {
                    Main.StergeSarcina(toateSarcinile.get(i));
                    toateSarcinile.removeAll(toateSarcinile.get(i));
            }
        }
        UpdateTabel();
    }

    public void SeteazaSarcinaTerminata()
    {
        ObservableList<Sarcina>sarciniSelecate;
        sarciniSelecate = tabelSarcini.getSelectionModel().getSelectedItems();
        for (Sarcina s : sarciniSelecate)
        {
            s.setTerminatSarcina(true);
        }
        tabelSarcini.getItems().setAll(Main.listaSarcini);
        UpdateTabel();
    }

    public void GoBackToMain() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/Main",rootPane.getScene());
    }

    public void GoToAddSarcina() throws Exception
    {
        new FXMLSceneChanger().SwitchScene("FXML_Pages/AdaugaSarcinaPage",rootPane.getScene());
    }

}
