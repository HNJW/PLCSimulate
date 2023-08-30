package com.plc.plcsimulate.entity.HeatRoom;

import org.springframework.util.ObjectUtils;

public enum HeatRoomStateEnum {
    Free("空闲","0"), Starting("启动中","1"), Heating("加热中","2"),
    Insulation("保温中","3"), Fault("加热房故障","4");

    private final String text;
    private final String value;

    HeatRoomStateEnum(String text, String value) {
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
    public static HeatRoomStateEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (HeatRoomStateEnum anEnum : HeatRoomStateEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}
