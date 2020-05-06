package customs;
import java.time.LocalDate;

import javafx.collections.ObservableList;

public class Receipts {
    private String issuedBy;
    private double amountSold;
    private LocalDate date;
    private ObservableList<Product> items;

    public Receipts(String issuedBy, double amountSold, LocalDate date, ObservableList<Product> items) {
        this.setIssuedBy(issuedBy);
        this.setAmountSold(amountSold);
        this.setDate(date);
        this.setItems(items);
    }

    public ObservableList<Product> getItems() {
        return items;
    }

    public void setItems(ObservableList<Product> items) {
        this.items = items;
    }

    public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(double amountSold) {
        this.amountSold = amountSold;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

}