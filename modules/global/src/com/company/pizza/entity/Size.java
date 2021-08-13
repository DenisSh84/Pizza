package com.company.pizza.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Size implements EnumClass<Integer> {

    SIZE_1(20),
    SIZE_2(25),
    SIZE_3(30);

    private Integer id;

    Size(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Size fromId(Integer id) {
        for (Size at : Size.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}