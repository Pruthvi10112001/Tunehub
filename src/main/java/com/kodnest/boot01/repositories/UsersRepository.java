package com.kodnest.boot01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.boot01.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

	public Users findByEmail(String email);

}
