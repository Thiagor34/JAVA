package com.projeto.spring.jpa.hibernate.repositories;

import com.projeto.spring.jpa.hibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Vai instanciar um obj Repository para trabalhar com user
public interface UserRepository extends JpaRepository<User, Long> {
}
