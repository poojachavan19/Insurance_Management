package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Claims;

public interface ClaimsRepository extends JpaRepository<Claims, Integer> {

}
