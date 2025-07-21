package com.davi.projetoSpringBootJava.repositories;

import com.davi.projetoSpringBootJava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
