package com.example.demo.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.user;
@Repository
public interface userRepository extends JpaRepository<user, Integer> {

}
