package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class FXMLSceneChanger {

    public FXMLLoader loader;

    public void SwitchScene(String fxml, Scene scene) throws IOException
    {
        loader = new FXMLLoader(getClass().getResource(fxml+".fxml"));
        Parent root = loader.load();
        scene.setRoot(root);
    }
}
