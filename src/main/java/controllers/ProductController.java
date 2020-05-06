package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import customs.Anim;
import customs.Product;
import helpers.ProductControllerHelper;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProductController implements Initializable {

    ProductControllerHelper ph = new ProductControllerHelper(this);
    Anim anim = new Anim();

    public TableView<Product> product_table;
    public TableColumn<Product, String> name_colm;
    public TableColumn<Product, Double> price_colm;
    public TableColumn<Product, Integer> quantity_colm;
    public TableColumn<Product, Integer> id_colm;

    public void search(MainController mc) {

        FilteredList<Product> filteredList = new FilteredList<>(ph.getList());

        if (!mc.search_field.getText().isEmpty()) {
            filteredList.setPredicate(a -> a.getName().toLowerCase().contains(mc.search_field.getText().toLowerCase()));
            product_table.setItems(filteredList);
        } else {
            product_table.setItems(ph.getProductList());
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        name_colm.setCellValueFactory(new PropertyValueFactory<>("name"));
        price_colm.setCellValueFactory(new PropertyValueFactory<>("price"));
        quantity_colm.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        id_colm.setCellValueFactory(new PropertyValueFactory<>("id"));
        product_table.setItems(ph.getList());

        anim.basicAnim(product_table);

    }

}