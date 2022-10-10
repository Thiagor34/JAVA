package com.projeto.spring.jpa.hibernate.repositories;

import com.projeto.spring.jpa.hibernate.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
