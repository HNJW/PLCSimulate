package com.plc.plcsimulate.entity.ClosingArea;

import org.springframework.util.ObjectUtils;

public enum ClosingAreaSandBoxArriveEnum {
    SandBoxArrive("砂箱到达","0401");

    private final String text;
    private final String value;

    ClosingAreaSandBoxArriveEnum(String text, String value) {
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
    public static ClosingAreaSandBoxArriveEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (ClosingAreaSandBoxArriveEnum anEnum : ClosingAreaSandBoxArriveEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}
