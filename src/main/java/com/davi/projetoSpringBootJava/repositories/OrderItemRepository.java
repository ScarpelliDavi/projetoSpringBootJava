package com.davi.projetoSpringBootJava.repositories;

import com.davi.projetoSpringBootJava.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
