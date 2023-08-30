package com.plc.plcsimulate.entity.HeatRoom;

import org.springframework.util.ObjectUtils;

public enum HeatRoomControlEnum {
    StartHeat("开始加热","0201"), EndHeat("停止加热","0202"),
    StartInsulation("开始保温","0203"), EndInsulation("停止保温","0204");

    private final String text;
    private final String value;

    HeatRoomControlEnum(String text, String value) {
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
    public static HeatRoomControlEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (HeatRoomControlEnum anEnum : HeatRoomControlEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}
