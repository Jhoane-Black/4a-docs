package com.leaf.Facturacion.repositories;

import com.leaf.Facturacion.models.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {

}
