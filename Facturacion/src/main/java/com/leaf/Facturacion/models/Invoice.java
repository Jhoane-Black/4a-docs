package com.leaf.Facturacion.models;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import java.util.Date;


public class Invoice {
    // Attributes
    @Id
    private String id;
    private Date date;
    private String username;
    private String product;
    private Integer price;
    private Integer quantity;
    private Integer total;

    // Constructor
    public Invoice(String id, Date date, String username, String product, Integer price, Integer quantity) {
        this.id = id;
        this.date = date;
        this.username = username;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.total = price * quantity;
    }

    // Methods

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getUsername() {
        return username;
    }

    public String getProduct() {
        return product;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}