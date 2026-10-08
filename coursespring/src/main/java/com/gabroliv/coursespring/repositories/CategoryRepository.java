package com.gabroliv.coursespring.repositories;

import com.gabroliv.coursespring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
