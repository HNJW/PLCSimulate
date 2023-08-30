package com.plc.plcsimulate.PLCMemorySimulate.ModelingLine;

import java.util.ArrayList;
import java.util.List;

public class ModelingLineData {
    public static List<Integer> ModelingLinePLCMemoryData;

    public final static int ModelingLineLength = 10;

    public ModelingLineData() {
        ModelingLinePLCMemoryData = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            ModelingLinePLCMemoryData.add(0);
        }
    }
}
