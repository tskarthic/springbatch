package com.tsk.batch.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsk.batch.example.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
}
