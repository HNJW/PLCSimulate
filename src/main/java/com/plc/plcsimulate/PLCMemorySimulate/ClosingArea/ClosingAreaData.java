package com.plc.plcsimulate.PLCMemorySimulate.ClosingArea;

import java.util.ArrayList;
import java.util.List;

public class ClosingAreaData {
    public static List<Integer> ClosingAreaPLCMemoryData;

    public final static int ClosingAreaLineLength = 6;

    public ClosingAreaData() {
        ClosingAreaPLCMemoryData = new ArrayList<>(12);
        for (int i = 0; i < 12; i++) {
            ClosingAreaPLCMemoryData.add(0);
        }
    }
}
