package com.plc.plcsimulate.service;

import com.plc.plcsimulate.entity.SandBoxModel.sandBoxModelSearchEnum;
import com.plc.plcsimulate.entity.SandBoxModel.WarehouseInAndOutEnum;
import com.plc.plcsimulate.entity.SandBoxModel.sandBoxModelSearchResultCodeEnum;

public interface SandBoxModelService {
    // 查询砂箱
    sandBoxModelSearchResultCodeEnum searchSandBox(sandBoxModelSearchEnum instruction, Integer SandBoxId, Integer typeId) throws Exception;
    // 查询模具
    sandBoxModelSearchResultCodeEnum searchModel(sandBoxModelSearchEnum instruction, Integer modelId, Integer typeId) throws Exception;
    // 砂箱入库
    void sandBoxIn(WarehouseInAndOutEnum instruction, Integer sandBoxId, Integer typeId) throws Exception;
    // 砂箱出库
    Integer sandBoxOut(WarehouseInAndOutEnum instruction, Integer sandBoxId, Integer typeId) throws Exception;
    // 模具入库
    void modelIn(WarehouseInAndOutEnum instruction, Integer modelId, Integer typeId) throws Exception;
    // 模具出库
    Integer modelOut(WarehouseInAndOutEnum instruction, Integer modelId, Integer typeId) throws Exception;
}
