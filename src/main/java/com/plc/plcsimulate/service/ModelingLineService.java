package com.plc.plcsimulate.service;

import com.plc.plcsimulate.entity.ModelingLine.ModelingLineSandBoxModelArriveEnum;

public interface ModelingLineService {
    // 砂箱到达
    void SandBoxArrive(ModelingLineSandBoxModelArriveEnum code, String sandBoxId, String typeId, String ModelingLineId) throws Exception;
    // 模具到达
    void MoldArrive(ModelingLineSandBoxModelArriveEnum code, String moldId, String typeId, String ModelingLineId) throws Exception;
}
