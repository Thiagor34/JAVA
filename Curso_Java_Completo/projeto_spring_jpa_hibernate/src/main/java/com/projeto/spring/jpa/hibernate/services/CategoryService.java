package com.projeto.spring.jpa.hibernate.services;

import com.projeto.spring.jpa.hibernate.entities.Category;
import com.projeto.spring.jpa.hibernate.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component                //registra a classe como componente do spring para ser injetado com o @autoWired
@Service                    //registra um serviço na camada de serviço
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {               //endpoint que trás todos category lá do UserResource
        return repository.findAll();
    }

    public Category findById(Long id) {                     //endpoint que trás um category por id
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
