package com.plc.plcsimulate.service.impl;

import com.plc.plcsimulate.entity.ClosingArea.ClosingAreaSandBoxArriveEnum;
import com.plc.plcsimulate.service.ClosingAreaService;

import static com.plc.plcsimulate.PLCMemorySimulate.ClosingArea.ClosingAreaData.ClosingAreaLineLength;
import static com.plc.plcsimulate.PLCMemorySimulate.ClosingArea.ClosingAreaData.ClosingAreaPLCMemoryData;

public class ClosingAreaServiceImpl implements ClosingAreaService {
    @Override
    // 砂箱到达
    public void SandBoxArrive(ClosingAreaSandBoxArriveEnum instruction,
                              String sandBoxId, String typeId, String lineId) throws Exception {
        if (instruction != ClosingAreaSandBoxArriveEnum.SandBoxArrive) {
            throw new Exception();
        }
        System.out.println("砂箱到达");
        int finalLineId = Integer.parseInt(lineId);
        new Thread(() -> {
            int num = 1;
            while(num < ClosingAreaLineLength) {
                try {
                    Thread.sleep(1000);
                    ClosingAreaPLCMemoryData.set((finalLineId - 1) * ClosingAreaLineLength + num - 1, 0);
                    ClosingAreaPLCMemoryData.set((finalLineId - 1) * ClosingAreaLineLength + num, Integer.valueOf(sandBoxId));
                    // 输出ModelingLinePLCMemoryData，六个数一行
                    for (int i = 0; i < ClosingAreaPLCMemoryData.size(); i++) {
                        if (i % ClosingAreaLineLength == 0) {
                            System.out.println();
                        }
                        System.out.print(ClosingAreaPLCMemoryData.get(i) + " ");
                    }
                    System.out.println();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num++;
            }
        }).start();
    }
}
