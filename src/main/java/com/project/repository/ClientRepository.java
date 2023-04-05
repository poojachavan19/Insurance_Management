package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
