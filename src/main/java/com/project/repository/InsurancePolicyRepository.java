package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.InsurancePolicy;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Integer>{

}
