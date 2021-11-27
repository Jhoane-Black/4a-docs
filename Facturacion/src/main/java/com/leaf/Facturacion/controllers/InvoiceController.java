package com.leaf.Facturacion.controllers;

import com.leaf.Facturacion.models.Invoice;
import com.leaf.Facturacion.repositories.InvoiceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class InvoiceController {
    // Attributes
    private final InvoiceRepository repository;

    // Constructor
    public InvoiceController(InvoiceRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/invoice/{id}")
    public Optional<Invoice> getInvoice(@PathVariable String id){
        return this.repository.findById(id);
    }
    @PostMapping("/invoice")
    public Invoice newInvoice(@RequestBody Invoice invoice){
        return this.repository.save(invoice);
    }
    @DeleteMapping("/invoice/{id}")
    public void deleteInvoice(@PathVariable String id){
        repository.deleteById(id);
    }
    @PutMapping("/invoice/{id}")
    public Invoice updateInvoice(@PathVariable String id, @RequestBody Invoice new_invoice){
        Invoice old_invoice = repository.findById(id).orElse(null);
        // ESTO ACTUALIZA EL OBJETO JAVA
        old_invoice.setDate(new_invoice.getDate());
        old_invoice.setUsername(new_invoice.getUsername());
        old_invoice.setProduct(new_invoice.getProduct());
        old_invoice.setPrice(new_invoice.getPrice());
        old_invoice.setQuantity(new_invoice.getQuantity());
        old_invoice.setTotal(new_invoice.getPrice() * new_invoice.getQuantity());

        // ESTO SÍ ACTUALIZA LA BASE DE DATOS
        return repository.save(old_invoice);

    }
}
