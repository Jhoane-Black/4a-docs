package com.example.Register.controllers;
import com.example.Register.repositories.RegisterRepository;
import com.example.Register.models.SaleRegister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // it'll do that the next class exposes a APIREST (?)
public class RegisterController {
    private final RegisterRepository repository;

    public RegisterController(RegisterRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/sale-register/{nombre_cliente}") // convert the next method to an endpoint
    List<SaleRegister> getSaleRegisterByCliente(@PathVariable String nombre_cliente){
        return this.repository.getByNombreCliente(nombre_cliente);
    }
    @PostMapping("/sale-register")
    SaleRegister newSaleRegister(@RequestBody SaleRegister saleRegister){
        return this.repository.save(saleRegister);
    }
    /*
    @DeleteMapping("/sale-register/{registroID}")
    public void deleteRegister(@PathVariable String registroID){
        repository.deleteById(registroID);
    }

    @PutMapping("/sale-register/{registroID}")
    public SaleRegister updateRegister(@PathVariable String registroID, @RequestBody SaleRegister newSRegister){
        SaleRegister oldSRegister = repository.findById(registroID).orElse(null);
        oldSRegister.setCantidad(newSRegister.getCantidad());
        oldSRegister.setFecha(newSRegister.getFecha());
        oldSRegister.setNombre_cliente(newSRegister.getNombre_cliente());
        oldSRegister.setProveedor(newSRegister.getProveedor());
        oldSRegister.setNombre_producto(newSRegister.getNombre_producto());
        oldSRegister.setPromocion(newSRegister.getPromocion());
        oldSRegister.setPrecio(newSRegister.getPrecio());
        oldSRegister.setTotal(newSRegister.getPrecio(),newSRegister.getCantidad());
        return repository.save(oldSRegister);
    }*/
}
