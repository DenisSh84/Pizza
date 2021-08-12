package com.company.pizza.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Table(name = "PIZZA_DELIVERY")
@Entity(name = "pizza_Delivery")
public class Delivery extends StandardEntity {
    private static final long serialVersionUID = 4615609907448565211L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COURIER_ID")
    private User courier;

    @NotNull
    @Column(name = "CLIENT_NAME", nullable = false, length = 100)
    private String clientName;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, unique = true, length = 30)
    private String phoneNumber;

    @NotNull
    @Column(name = "EMAIL", nullable = false)
    @Email
    private String email;

    @NotNull
    @Column(name = "ADDRES", nullable = false)
    private String addres;

    @Lob
    @Column(name = "COMMENT_")
    private String comment;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "deliver")
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public User getCourier() {
        return courier;
    }

    public void setCourier(User courier) {
        this.courier = courier;
    }
}