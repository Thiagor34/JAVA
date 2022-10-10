package com.projeto.spring.jpa.hibernate.services;

import com.projeto.spring.jpa.hibernate.entities.Order;
import com.projeto.spring.jpa.hibernate.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component                //registra a classe como componente do spring para ser injetado com o @autoWired
@Service                    //registra um serviço na camada de serviço
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {               //endpoint que trás todas as order lá do UserResource
        return repository.findAll();
    }

    public Order findById(Long id) {                     //endpoint que trás uma order por id
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
