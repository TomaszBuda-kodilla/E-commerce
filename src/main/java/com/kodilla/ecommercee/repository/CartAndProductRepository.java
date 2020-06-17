package com.kodilla.ecommercee.repository;

import com.kodilla.ecommercee.domain.CartProducts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartAndProductRepository extends CrudRepository<CartProducts, Long> {

    @Query("SELECT cartId FROM CartProducts WHERE cartId = cartId")
    public List<Long> getProductIds(Long cartId);
}
