package chrisferdev.springbootdifactura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chrisferdev.springbootdifactura.models.Invoice;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {
    
    @Autowired
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice show(){
        return invoice;
    }
}
