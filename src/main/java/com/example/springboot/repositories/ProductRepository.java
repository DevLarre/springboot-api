package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
