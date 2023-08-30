package com.plc.plcsimulate.service.impl;

import com.plc.plcsimulate.entity.ModelingLine.ModelingLineSandBoxModelArriveEnum;
import com.plc.plcsimulate.service.ModelingLineService;

import static com.plc.plcsimulate.PLCMemorySimulate.ModelingLine.ModelingLineData.ModelingLineLength;
import static com.plc.plcsimulate.PLCMemorySimulate.ModelingLine.ModelingLineData.ModelingLinePLCMemoryData;

public class ModelingLineServiceImpl implements ModelingLineService {

    @Override
    // 砂箱到达
    public void SandBoxArrive(ModelingLineSandBoxModelArriveEnum instruction,
                              String sandBoxId, String typeId, String ModelingLineId) throws Exception {
        if (instruction != ModelingLineSandBoxModelArriveEnum.SandBoxArrive) {
            throw new Exception();
        }
        int lineId = Integer.parseInt(ModelingLineId);
        ModelingLinePLCMemoryData.set((lineId - 1) * ModelingLineLength, Integer.valueOf(sandBoxId));
        System.out.println("砂箱到达");
        // 开一个异步线程，模拟砂箱离开
        simulateLeave(lineId, sandBoxId, ModelingLineLength);
    }

    @Override
    // 模具到达
    public void MoldArrive(ModelingLineSandBoxModelArriveEnum instruction,
                           String modelId, String typeId, String ModelingLineId) throws Exception {
        if (instruction != ModelingLineSandBoxModelArriveEnum.ModelArrive) {
            throw new Exception();
        }
        int lineId = Integer.parseInt(ModelingLineId);
        ModelingLinePLCMemoryData.set((lineId - 1) * ModelingLineLength, Integer.valueOf(modelId));
        System.out.println("模具到达");
        simulateLeave(lineId, modelId, ModelingLineLength);
    }

    private void simulateLeave(int lineId, String id, int lineLength) {
        new Thread(() -> {
            int num = 1;
            while(num < lineLength) {
                try {
                    Thread.sleep(1000);
                    ModelingLinePLCMemoryData.set((lineId - 1) * lineLength + num - 1, 0);
                    ModelingLinePLCMemoryData.set((lineId - 1) * lineLength + num, Integer.valueOf(id));
                    // 输出ModelingLinePLCMemoryData，六个数一行
                    for (int i = 0; i < ModelingLinePLCMemoryData.size(); i++) {
                        if (i % lineLength == 0) {
                            System.out.println();
                        }
                        System.out.print(ModelingLinePLCMemoryData.get(i) + " ");
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
