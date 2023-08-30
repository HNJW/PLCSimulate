package com.plc.plcsimulate.entity.SandBoxModel;

import org.springframework.util.ObjectUtils;

public enum sandBoxModelSearchEnum {
    SandBoxSearch("查询砂箱","0101"), ModelSearch("查询模具","0102"),
    AllSearch("查询全部库存","0107");

    private final String text;
    private final String value;

    sandBoxModelSearchEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }

    /**
     * 根据 value 获取枚举
     */
    public static sandBoxModelSearchEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (sandBoxModelSearchEnum anEnum : sandBoxModelSearchEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}
