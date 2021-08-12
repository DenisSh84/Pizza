package com.company.pizza.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "PIZZA_ORDER_ITEM")
@Entity(name = "pizza_OrderItem")
public class OrderItem extends StandardEntity {
    private static final long serialVersionUID = -5129858164112801422L;
}