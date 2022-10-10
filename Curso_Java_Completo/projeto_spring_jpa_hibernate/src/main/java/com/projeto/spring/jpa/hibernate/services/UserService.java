package com.projeto.spring.jpa.hibernate.services;

import com.projeto.spring.jpa.hibernate.entities.User;
import com.projeto.spring.jpa.hibernate.repositories.UserRepository;
import com.projeto.spring.jpa.hibernate.services.exceptions.DatabaseException;
import com.projeto.spring.jpa.hibernate.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component                //registra a classe como componente do spring para ser injetado com o @autoWired
@Service                    //registra um serviço na camada de serviço
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {               //endpoint que trás todos users lá do UserResource
        return repository.findAll();
    }

    public User findById(Long id) {                     //endpoint que trás um user por id
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
       return repository.save(obj);
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj) {
        try {
            User entity = repository.getReferenceById(id);
            updateData(entity, obj);
            return repository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    public void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
