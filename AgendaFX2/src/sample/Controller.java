package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller  {



    @FXML
    private Circle circ;
    private double x, y;
    public void up(ActionEvent e)
    {
        circ.setCenterY(y-=10);
    }
    public void down(ActionEvent e)
    {
        circ.setCenterY(y+=10);
    }
    public void left(ActionEvent e)
    {
        circ.setCenterX(x-=10);
    }
    public void right(ActionEvent e)
    {
        circ.setCenterX(x+=10);
    }




    public void SwitchToPage2(ActionEvent event) throws IOException
    {
        Stage stage;
        Scene scene;
        Parent root = FXMLLoader.load(getClass().getResource("Page2.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

