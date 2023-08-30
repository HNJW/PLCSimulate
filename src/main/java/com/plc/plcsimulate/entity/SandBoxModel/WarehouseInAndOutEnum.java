package com.plc.plcsimulate.entity.SandBoxModel;

import org.springframework.util.ObjectUtils;

public enum WarehouseInAndOutEnum {
    SandBoxIn("砂箱入库","0103"), SandBoxOut("砂箱出库","0104"),
    ModelIn("模具入库","0105"), ModelOut("模具出库","0106");

    private final String text;
    private final String value;

    WarehouseInAndOutEnum(String text, String value) {
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
    public static WarehouseInAndOutEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (WarehouseInAndOutEnum anEnum : WarehouseInAndOutEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}
