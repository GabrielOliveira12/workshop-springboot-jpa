package com.gabroliv.coursespring.repositories;

import com.gabroliv.coursespring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
