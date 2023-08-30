package com.plc.plcsimulate.entity.PouringArea;

import org.springframework.util.ObjectUtils;

public enum WorkpieceSpaceStateEnum {
    Fault("未知","-1"), NoWorkpiece("没工件存在","1"), HaveWorkpiece("有工件存在","2"),
    WaitWorkpieceIn("等待工件搬入","3"), WaitWorkpieceOut("等待工件搬出","4"),;

    private final String text;
    private final String value;

    WorkpieceSpaceStateEnum(String text, String value) {
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
    public static WorkpieceSpaceStateEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (WorkpieceSpaceStateEnum anEnum : WorkpieceSpaceStateEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}
