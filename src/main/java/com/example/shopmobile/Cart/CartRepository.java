package com.example.shopmobile.Cart;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    List<Cart> findByUserId(Long userId);
    void deleteById(Long id);
    void deleteByUserId(Long userId);
}



