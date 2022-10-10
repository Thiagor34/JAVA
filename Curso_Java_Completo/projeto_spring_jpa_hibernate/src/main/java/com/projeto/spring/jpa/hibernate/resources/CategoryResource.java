package com.projeto.spring.jpa.hibernate.resources;

import com.projeto.spring.jpa.hibernate.entities.Category;
import com.projeto.spring.jpa.hibernate.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController                                         //recurso
@RequestMapping(value = "/categories")                    //nome do recurso, "" é o caminho do recurso
public class CategoryResource {

    @Autowired                                          //dependencia para o service
    private CategoryService service;                        //precisa por o @Service no UserService

    @GetMapping                                      //responde ao get do http
    public ResponseEntity<List<Category>> findyAll() {            //endpoint
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")                     //responde ao get do http passando um id na url
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
