package com.company.pizza.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "PIZZA_PIZZA")
@Entity(name = "pizza_Pizza")
@NamePattern("%s|name")
public class Pizza extends StandardEntity {
    private static final long serialVersionUID = 4186425602332203836L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "SIZE_", nullable = false)
    @NotNull
    private Integer size;

    @Column(name = "CALORIES")
    @Min(0)
    private Integer calories;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    @Min(0)
    private Integer price;

    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "pizza")
    private List<OrderItem> orderItems;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public void setSize(Size size) {
        this.size = size == null ? null : size.getId();
    }

    public Size getSize() {
        return size == null ? null : Size.fromId(size);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}