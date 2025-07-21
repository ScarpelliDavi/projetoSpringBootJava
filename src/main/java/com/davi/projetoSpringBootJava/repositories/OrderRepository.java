package com.davi.projetoSpringBootJava.repositories;

import com.davi.projetoSpringBootJava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
