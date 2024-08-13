package com.lambdacode.Spring_crud.repository;

import com.lambdacode.Spring_crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

