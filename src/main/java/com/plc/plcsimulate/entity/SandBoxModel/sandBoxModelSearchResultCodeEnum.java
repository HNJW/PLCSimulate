package com.plc.plcsimulate.entity.SandBoxModel;

import org.springframework.util.ObjectUtils;

public enum sandBoxModelSearchResultCodeEnum {
    NULL("等待结果写入","-1"), InWarehouse("在库","9901"),
    StoringWarehouse("入库中","9902"), OutingWarehouse("出库中","9903"),
    NotInWarehouse("已出库","9904"), FailInWarehouse("入库失败","9905"),
    FailOutWarehouse("出库失败","9906"), UnKnowWrong("未知错误","9907");

    private final String text;
    private final String value;

    sandBoxModelSearchResultCodeEnum(String text, String value) {
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
    public static sandBoxModelSearchResultCodeEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (sandBoxModelSearchResultCodeEnum anEnum : sandBoxModelSearchResultCodeEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}
