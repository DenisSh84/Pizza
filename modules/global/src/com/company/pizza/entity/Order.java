package com.company.pizza.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "PIZZA_ORDER")
@Entity(name = "pizza_Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 7434331762778569833L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false, unique = true)
    @Positive
    @Min(1)
    private Integer number;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_", nullable = false)
    private Date createdDate;

    @NotNull
    @Column(name = "STATUS", nullable = false, length = 50)
    private String status;

    @NotNull
    @Column(name = "COST", nullable = false)
    private BigDecimal totalAmount;

    @Column(name = "ORDER_ITEMS")
    private String orderItems;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DELIVER_ID")
    private Delivery deliver;

    public Delivery getDeliver() {
        return deliver;
    }

    public void setDeliver(Delivery deliver) {
        this.deliver = deliver;
    }

    public String getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(String orderItems) {
        this.orderItems = orderItems;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal cost) {
        this.totalAmount = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date date) {
        this.createdDate = date;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}