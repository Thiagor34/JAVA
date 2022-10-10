package com.projeto.spring.jpa.hibernate.services;

import com.projeto.spring.jpa.hibernate.entities.Product;
import com.projeto.spring.jpa.hibernate.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component                //registra a classe como componente do spring para ser injetado com o @autoWired
@Service                    //registra um serviço na camada de serviço
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {               //endpoint que trás todos product lá do productResource
        return repository.findAll();
    }

    public Product findById(Long id) {                     //endpoint que trás um product por id
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
