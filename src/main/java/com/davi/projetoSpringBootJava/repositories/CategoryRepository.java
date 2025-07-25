package com.davi.projetoSpringBootJava.repositories;

import com.davi.projetoSpringBootJava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
