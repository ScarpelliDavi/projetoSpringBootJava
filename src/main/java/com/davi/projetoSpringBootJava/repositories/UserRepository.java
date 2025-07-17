package com.davi.projetoSpringBootJava.repositories;

import com.davi.projetoSpringBootJava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
