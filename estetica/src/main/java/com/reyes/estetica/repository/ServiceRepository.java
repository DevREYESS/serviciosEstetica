package com.reyes.estetica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reyes.estetica.model.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    
}
