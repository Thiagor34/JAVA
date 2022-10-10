package com.projeto.spring.jpa.hibernate.resources;

import com.projeto.spring.jpa.hibernate.entities.Category;
import com.projeto.spring.jpa.hibernate.entities.Product;
import com.projeto.spring.jpa.hibernate.services.CategoryService;
import com.projeto.spring.jpa.hibernate.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController                                         //recurso
@RequestMapping(value = "/products")                    //nome do recurso, "" é o caminho do recurso
public class ProductResource {

    @Autowired                                          //dependencia para o service
    private ProductService service;                        //precisa por o @Service no UserService

    @GetMapping                                      //responde ao get do http
    public ResponseEntity<List<Product>> findyAll() {            //endpoint
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")                     //responde ao get do http passando um id na url
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
