package com.example.Register.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.Register.models.SaleRegister;

import java.util.List;

public interface RegisterRepository extends MongoRepository<SaleRegister, String> {
    List<SaleRegister> getByNombreCliente(String nombre_cliente);
    List<SaleRegister> getByNombreProducto(String nombre_producto);
}
