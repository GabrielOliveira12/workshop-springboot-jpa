package com.gabroliv.coursespring.repositories;

import com.gabroliv.coursespring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
