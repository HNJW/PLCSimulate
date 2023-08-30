package com.plc.plcsimulate.entity.ModelingLine;

import org.springframework.util.ObjectUtils;

public enum ModelingLineSandBoxModelArriveEnum {
    SandBoxArrive("砂箱到达","0301"), ModelArrive("模具到达","0302");

    private final String text;
    private final String value;

    ModelingLineSandBoxModelArriveEnum(String text, String value) {
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
    public static ModelingLineSandBoxModelArriveEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (ModelingLineSandBoxModelArriveEnum anEnum : ModelingLineSandBoxModelArriveEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}
