package com.kodilla.ecommercee.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ORDERS")
public class Order {
    private Long id;
    private Long userId;
    private Long cartId;

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public Long getId() {
        return id;
    }


    @Column(name = "USER_ID")
    public Long getUserId() {
        return userId;
    }


    @Column(name = "CART_ID")
    public Long getCartId() {
        return cartId;
    }

    public Order() {

    }

    public Order(Long id, Long userId, Long cartId) {
        this.id = id;
        this.userId = userId;
        this.cartId = cartId;
    }

    public Order(Long userId, Long cartId) {
        this.userId = userId;
        this.cartId = cartId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }
}
