package com.plc.plcsimulate.service;

import com.plc.plcsimulate.entity.ClosingArea.ClosingAreaSandBoxArriveEnum;

public interface ClosingAreaService {
    // 砂箱到达
    void SandBoxArrive(ClosingAreaSandBoxArriveEnum code, String sandBoxId, String typeId, String lineId) throws Exception;
}
