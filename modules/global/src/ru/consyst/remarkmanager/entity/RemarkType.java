package ru.consyst.remarkmanager.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum RemarkType implements EnumClass<Integer> {

    ЗАМЕЧАНИЕ(10),
    ПРЕДЛОЖЕНИЕ(20);

    private Integer id;

    RemarkType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static RemarkType fromId(Integer id) {
        for (RemarkType at : RemarkType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}