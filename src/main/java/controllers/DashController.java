package controllers;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.ResourceBundle;

import customs.Product;
import customs.Receipts;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class DashController implements Initializable {

    public ListView<HBox> receipt_list;

    public ObservableList<Receipts> pop() {
        ObservableList<Receipts> r = FXCollections.observableArrayList();

        ObservableList<Product> p = FXCollections.observableArrayList();

        for (int i = 0; i <= 100; i++) {
            r.add(new Receipts("Quansah Kelvin Kobina", 30.0, LocalDate.now(), p));
        }
        return r;
    }

    public void po() {
        ObservableList<Receipts> r = pop();
        for (Receipts a : r) {
            System.out.println(a.getIssuedBy());

            String issued = a.getIssuedBy();
            LocalDate date = a.getDate();
            double amount = a.getAmountSold();
            int numberofItems = a.getItems().size();
            String parsedDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)).toString().toUpperCase();
            Text issuedBy = new Text(issued);
            Text dte = new Text(parsedDate);
            Text amt = new Text(String.valueOf(amount));
            Text num = new Text(String.valueOf(numberofItems));

            Text is = new Text("ISSUED BY");
            Text d = new Text("DATE");
            Text at = new Text("AMOUNT SOLD");
            Text n = new Text("NUMBER OF ITEMS");

            is.getStyleClass().add("txt");
            d.getStyleClass().add("txt");
            at.getStyleClass().add("txt");
            n.getStyleClass().add("txt");

            issuedBy.getStyleClass().add("txthead");
            dte.getStyleClass().add("txthead");
            amt.getStyleClass().add("txthead");
            num.getStyleClass().add("txthead");

            VBox name = new VBox(5);
            name.getChildren().add(is);
            name.getChildren().add(issuedBy);

            VBox sold = new VBox(5);
            sold.getChildren().add(at);
            sold.getChildren().add(amt);

            VBox dateVbox = new VBox(5);
            dateVbox.getChildren().add(d);
            dateVbox.getChildren().add(dte);

            VBox numVbox = new VBox(5);
            numVbox.getChildren().add(n);
            numVbox.getChildren().add(num);

            HBox innerWrap = new HBox(120);
            innerWrap.getChildren().addAll(name,sold,dateVbox,numVbox);
            HBox wrapper = new HBox();
            wrapper.getChildren().add(innerWrap);
            receipt_list.getItems().add(wrapper);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        po();
    }

}