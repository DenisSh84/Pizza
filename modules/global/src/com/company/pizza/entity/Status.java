package com.company.pizza.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Status implements EnumClass<String> {

    STATUS_1("создан"),
    STATUS_2("оплачен"),
    STATUS_3("готовится"),
    STATUS_4("готов"),
    STATUS_5("доставка"),
    STATUS_6("доставлен"),
    STATUS_7("отменен");

    private String id;

    Status(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Status fromId(String id) {
        for (Status at : Status.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}