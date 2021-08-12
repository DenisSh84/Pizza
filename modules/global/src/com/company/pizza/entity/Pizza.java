package com.company.pizza.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.app.dynamicattributes.PropertyType;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Table(name = "PIZZA_PIZZA")
@Entity(name = "pizza_Pizza")
@NamePattern("%s|name")
public class Pizza extends StandardEntity {
    private static final long serialVersionUID = 4186425602332203836L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "SIZE_", nullable = false)
    private String size;

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

    public PropertyType getSize() {
        return size == null ? null : PropertyType.fromId(size);
    }

    public void setSize(PropertyType size) {
        this.size = size == null ? null : size.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}