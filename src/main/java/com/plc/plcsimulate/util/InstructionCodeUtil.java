package com.plc.plcsimulate.util;

public class InstructionCodeUtil {
    public static String GenerateCode(Integer Area, Integer number) {
        if (Area > 99 || Area < 0 || number > 99 || number < 0) {
            return null;
        }
        // 将Area转换成两位字符串，前导0补齐
        String AreaStr = String.format("%02d", Area);
        // 将number转换成两位字符串，前导0补齐
        String numberStr = String.format("%02d", number);
        return AreaStr + numberStr;
    }
}
