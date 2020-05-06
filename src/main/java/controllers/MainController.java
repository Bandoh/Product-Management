package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import helpers.MainControllerHelper;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;

public class MainController implements Initializable {
    MainControllerHelper mh = new MainControllerHelper(this);
    ProductController pc = new ProductController();

    public ToggleButton dash_toggle;

    public TextField search_field;
    public BorderPane main_win;

    public void searchField() {
       pc.search(this);
       System.out.println(pc.product_table);

    }

    public void goDash() throws IOException {
        mh.nav(main_win, "/screens/dashboard.fxml");
    }

    public void goProducts() throws IOException {
        FXMLLoader loader = mh.nav(main_win, "/screens/products.fxml");
        ProductController p = loader.getController();
        System.out.println(p.product_table);
        this.pc = p;
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
        mh.nav(main_win, "/screens/dashboard.fxml");
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
