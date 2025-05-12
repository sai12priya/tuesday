package com.tcs.training.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.training.Entity.User;

public interface UserRepository extends JpaRepository<User,Integer>  {
	Optional<User> findByUsername(String username);
}
