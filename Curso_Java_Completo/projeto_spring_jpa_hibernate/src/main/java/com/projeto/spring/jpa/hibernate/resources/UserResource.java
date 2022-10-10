package com.projeto.spring.jpa.hibernate.resources;

import com.projeto.spring.jpa.hibernate.entities.User;
import com.projeto.spring.jpa.hibernate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController                                         //recurso
@RequestMapping(value = "/users")                    //nome do recurso, "" é o caminho do recurso
public class UserResource {

    @Autowired                                          //dependencia para o service
    private UserService service;                        //precisa por o @Service no UserService

    @GetMapping                                      //responde ao get do http
    public ResponseEntity<List<User>> findyAll() {            //endpoint
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")                     //responde ao get do http passando um id na url
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping                                       //inserção no http
    public ResponseEntity<User> insert(@RequestBody User obj) {
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")                                       //delete no http
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")                                            //Update no http
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

}
