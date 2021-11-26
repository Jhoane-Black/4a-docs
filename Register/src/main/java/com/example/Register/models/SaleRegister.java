package com.example.Register.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "microservice2")
public class SaleRegister {
    @Id
    private String registroID;
    private String nombre_cliente;
    private String proveedor;
    private String nombre_producto;
    private Integer cantidad;
    private Integer precio;
    private Integer total;
    private Date fecha;
    private String promocion;

    public SaleRegister(String registroID, String nombre_cliente, String proveedor, String nombre_producto, Integer cantidad, Integer precio, Date fecha, String promocion) {
        this.registroID = registroID;
        this.nombre_cliente = nombre_cliente;
        this.proveedor = proveedor;
        this.nombre_producto = nombre_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;
        this.promocion = promocion;
        this.total = precio*cantidad;
    }

    public String getRegistroID() {
        return registroID;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }
}
