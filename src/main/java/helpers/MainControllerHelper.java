package helpers;

import java.io.IOException;

import controllers.MainController;
import customs.Anim;
import customs.Product;
import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

public class MainControllerHelper {

    public MainControllerHelper(MainController m) {
        this.mc = m;
    }
    private MainController mc;
    Anim anim = new Anim();

    public FXMLLoader nav(BorderPane main_win, String path) throws IOException {
        String fxmlFile = path;
        FXMLLoader loader = new FXMLLoader();
        AnchorPane root = (AnchorPane) loader.load(getClass().getResourceAsStream(fxmlFile));
        anim.basicAnim(root); 
        main_win.setCenter(root);
        return loader;
    }


}