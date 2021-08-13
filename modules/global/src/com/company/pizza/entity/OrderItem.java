package com.company.pizza.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Table(name = "PIZZA_ORDER_ITEM")
@Entity(name = "pizza_OrderItem")
public class OrderItem extends StandardEntity {
    private static final long serialVersionUID = -5129858164112801422L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    @OnDelete(DeletePolicy.CASCADE)
    @JoinColumn(name = "PIZZA_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pizza pizza;

    @NotNull
    @Column(name = "QUANTITY", nullable = false)
    @Min(1)
    private Integer quantity;

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}