package com.company.pizza.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "PIZZA_INGREDIENT")
@Entity(name = "pizza_Ingredient")
public class Ingredient extends StandardEntity {
    private static final long serialVersionUID = 4777002513880895452L;

    @NotNull
    @JoinColumn(name = "PIZZA_ID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Pizza pizza;

    @JoinColumn(name = "TOPING_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Topping toping;

    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;

    public void setToping(Topping toping) {
        this.toping = toping;
    }

    public Topping getToping() {
        return toping;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}