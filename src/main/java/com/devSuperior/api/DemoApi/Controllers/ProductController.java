package com.devSuperior.api.DemoApi.Controllers;

import com.devSuperior.api.DemoApi.Entities.Departament;
import com.devSuperior.api.DemoApi.Entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getObjects(){
        Departament d1 = new Departament(1L, "Tech");
        Departament d2 = new Departament(2L, "Pet");

        Product p1 = new Product(1L, "MacBook Pro", 6000.0, d1);
        Product p2 = new Product(1L, "PC Gamer", 5000.0, d1);
        Product p3 = new Product(1L, "Pet House ", 150.0, d2);

        List<Product> list = Arrays.asList(p1, p2, p3);
        return list;
    }

}
