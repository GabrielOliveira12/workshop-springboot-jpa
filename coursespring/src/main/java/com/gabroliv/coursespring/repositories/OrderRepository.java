package com.gabroliv.coursespring.repositories;

import com.gabroliv.coursespring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
