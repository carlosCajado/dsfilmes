package com.flmescajado.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flmescajado.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String Email);

}
