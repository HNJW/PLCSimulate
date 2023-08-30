package com.plc.plcsimulate.entity.HeatRoom;

import org.springframework.util.ObjectUtils;

public enum HeatRoomControlResultCodeEnum {
    NULL("等待结果写入","-1"), StartFailHeat("启动失败","9901"),
    StartSuccessHeat("启动成功","9901"), HeatFail("加热失败", "9902"),
    HeatSuccess("加热成功", "9904"), EndFailHeat("停止失败","9905"),
    EndSuccess("停止成功", "9906"), StartInsulationFail("保温失败","9907"),
    StartInsulationSuccess("保温成功","9908"), EndInsulationFail("停止保温失败","9909"),
    EndInsulationSuccess("停止保温成功","9910");

    private final String text;
    private final String value;

    HeatRoomControlResultCodeEnum(String text, String value) {
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
    public static HeatRoomControlResultCodeEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (HeatRoomControlResultCodeEnum anEnum : HeatRoomControlResultCodeEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}
