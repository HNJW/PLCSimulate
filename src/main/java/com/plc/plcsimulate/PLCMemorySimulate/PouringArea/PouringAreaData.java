package com.plc.plcsimulate.PLCMemorySimulate.PouringArea;

import java.util.ArrayList;
import java.util.List;

public class PouringAreaData {
    public static List<Integer> PouringAreaPLCMemoryData;

    public PouringAreaData() {
        PouringAreaPLCMemoryData = new ArrayList<>();
        for (int i = 0; i < 110; i++) {
            PouringAreaPLCMemoryData.add(1);
        }
    }
}
