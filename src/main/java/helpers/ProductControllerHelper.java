package helpers;

import controllers.ProductController;
import customs.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProductControllerHelper {

    public ProductControllerHelper(ProductController controller){

    }

    private ObservableList<Product> productList = null;

    public ObservableList<Product> getList() {
        ObservableList<Product> products = FXCollections.observableArrayList();
        for (int i = 0; i <= 90; i++) {
            products.add(new Product("Paracetamol" + i, 3.90, 30, i));
        }
        this.setProductList(products);
        return products;
    }

    public ObservableList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ObservableList<Product> productList) {
        this.productList = productList;
    }
    
}