package com.plc.plcsimulate.entity.ModelingLine;

import org.springframework.util.ObjectUtils;

public enum ModelingLineDeviceStateEnum {
    Fault("设备故障","-1"), Free("空闲","1"), Starting("启动中","2"),
    Working("设备工作中","3");

    private final String text;
    private final String value;

    ModelingLineDeviceStateEnum(String text, String value) {
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
    public static ModelingLineDeviceStateEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (ModelingLineDeviceStateEnum anEnum : ModelingLineDeviceStateEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}
