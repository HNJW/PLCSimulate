package com.plc.plcsimulate.PLCMemorySimulate.SandBoxModel;

import com.plc.plcsimulate.entity.SandBoxModel.sandBoxModelSearchResultCodeEnum;

import java.util.HashMap;
import java.util.Map;

public class SandBoxModelData {
    public static Map<String, sandBoxModelSearchResultCodeEnum> sandBoxModelInOrNot;

    public SandBoxModelData() {
        sandBoxModelInOrNot = new HashMap<>();
        sandBoxModelInOrNot.put("11", sandBoxModelSearchResultCodeEnum.InWarehouse);
        sandBoxModelInOrNot.put("21", sandBoxModelSearchResultCodeEnum.InWarehouse);
        sandBoxModelInOrNot.put("31", sandBoxModelSearchResultCodeEnum.InWarehouse);
        sandBoxModelInOrNot.put("41", sandBoxModelSearchResultCodeEnum.InWarehouse);
        sandBoxModelInOrNot.put("51", sandBoxModelSearchResultCodeEnum.InWarehouse);
        sandBoxModelInOrNot.put("62", sandBoxModelSearchResultCodeEnum.InWarehouse);
        sandBoxModelInOrNot.put("72", sandBoxModelSearchResultCodeEnum.InWarehouse);
        sandBoxModelInOrNot.put("82", sandBoxModelSearchResultCodeEnum.InWarehouse);
        sandBoxModelInOrNot.put("92", sandBoxModelSearchResultCodeEnum.InWarehouse);
    }
}
