package com.plc.plcsimulate.entity.SandBoxModel;

import org.springframework.util.ObjectUtils;

public enum WarehouseOutResultCodeEnum {
    NULL("等待结果写入","-1"), OutFail("出库失败","9901"),
    Outing("出库中","9902"), OutQueue("排队出库中","9903"),
    OutSuccess("出库成功","9904");

    private final String text;
    private final String value;

    WarehouseOutResultCodeEnum(String text, String value) {
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
    public static WarehouseOutResultCodeEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (WarehouseOutResultCodeEnum anEnum : WarehouseOutResultCodeEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}
