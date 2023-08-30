package com.plc.plcsimulate.service.impl;

import com.plc.plcsimulate.entity.SandBoxModel.WarehouseInAndOutEnum;
import com.plc.plcsimulate.entity.SandBoxModel.sandBoxModelSearchEnum;
import com.plc.plcsimulate.entity.SandBoxModel.sandBoxModelSearchResultCodeEnum;
import com.plc.plcsimulate.service.SandBoxModelService;

import static com.plc.plcsimulate.PLCMemorySimulate.SandBoxModel.SandBoxModelData.sandBoxModelInOrNot;

public class SandBoxModelServiceImpl implements SandBoxModelService {
    @Override
    // 查询砂箱
    public sandBoxModelSearchResultCodeEnum searchSandBox(sandBoxModelSearchEnum instruction, Integer SandBoxId, Integer typeId) throws Exception {
        if (instruction != sandBoxModelSearchEnum.SandBoxSearch) {
            throw new Exception();
        }
        System.out.println("查询砂箱" + instruction.getValue());
        sandBoxModelSearchResultCodeEnum resultCodeEnum = sandBoxModelInOrNot.get(SandBoxId.toString() + typeId.toString());
        if (resultCodeEnum == null) {
            return sandBoxModelSearchResultCodeEnum.NotInWarehouse;
        }
        return resultCodeEnum;
    }

    @Override
    // 查询模具
    public sandBoxModelSearchResultCodeEnum searchModel(sandBoxModelSearchEnum instruction, Integer modelId, Integer typeId) throws Exception {
        if (instruction != sandBoxModelSearchEnum.ModelSearch) {
            throw new Exception();
        }
        sandBoxModelSearchResultCodeEnum resultCodeEnum = sandBoxModelInOrNot.get(modelId.toString() + typeId.toString());
        if (resultCodeEnum == null) {
            return sandBoxModelSearchResultCodeEnum.NotInWarehouse;
        }
        return resultCodeEnum;
    }

    @Override
    // 砂箱入库
    public void sandBoxIn(WarehouseInAndOutEnum instruction, Integer sandBoxId, Integer typeId) throws Exception {
        if (instruction != WarehouseInAndOutEnum.SandBoxIn) {
            throw new Exception();
        }
        System.out.println("砂箱入库" + instruction.getValue());
        sandBoxModelInOrNot.put(sandBoxId.toString() + typeId.toString(), sandBoxModelSearchResultCodeEnum.InWarehouse);
    }

    @Override
    // 砂箱出库
    public Integer sandBoxOut(WarehouseInAndOutEnum instruction, Integer sandBoxId, Integer typeId) throws Exception {
        if (instruction != WarehouseInAndOutEnum.SandBoxOut) {
            throw new Exception();
        }
        System.out.println("砂箱出库" + instruction.getValue());
        sandBoxModelInOrNot.put(sandBoxId.toString() + typeId.toString(), sandBoxModelSearchResultCodeEnum.NotInWarehouse);
        return 1;
    }

    @Override
    // 模具入库
    public void modelIn(WarehouseInAndOutEnum instruction, Integer modelId, Integer typeId) throws Exception {
        if (instruction != WarehouseInAndOutEnum.ModelIn) {
            throw new Exception();
        }
        System.out.println("模具入库" + instruction.getValue());
        sandBoxModelInOrNot.put(modelId.toString() + typeId.toString(), sandBoxModelSearchResultCodeEnum.InWarehouse);
    }

    @Override
    // 模具出库
    public Integer modelOut(WarehouseInAndOutEnum instruction, Integer modelId, Integer typeId) throws Exception {
        if (instruction != WarehouseInAndOutEnum.ModelOut) {
            throw new Exception();
        }
        System.out.println("模具出库" + instruction.getValue());
        sandBoxModelInOrNot.put(modelId.toString() + typeId.toString(), sandBoxModelSearchResultCodeEnum.NotInWarehouse);
        return 1;
    }
}
