package com.company.pizza.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.ReferenceToEntity;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
    @Column(name = "STATUS", nullable = false)
    private String status;

    @NotNull
    @Column(name = "COST", nullable = false)
    private BigDecimal totalAmount;

    @OneToMany(mappedBy = "order")
    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    private List<OrderItem> orderItems;

    @OneToOne(optional = false)
    @AttributeOverrides({
            @AttributeOverride(name = "entityId", column = @Column(name = "DELIVER_ENTITY_ID")),
            @AttributeOverride(name = "stringEntityId", column = @Column(name = "DELIVER_STRING_ENTITY_ID")),
            @AttributeOverride(name = "intEntityId", column = @Column(name = "DELIVER_INT_ENTITY_ID")),
            @AttributeOverride(name = "longEntityId", column = @Column(name = "DELIVER_LONG_ENTITY_ID"))
    })
    private @Embedded
    @NotNull ReferenceToEntity deliver;

    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }

    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }

    public void setDeliver(ReferenceToEntity deliver) {
        this.deliver = deliver;
    }

    public ReferenceToEntity getDeliver() {
        return deliver;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal cost) {
        this.totalAmount = cost;
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