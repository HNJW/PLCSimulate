package com.plc.plcsimulate.PLCMemorySimulate.HeatRoom;

import com.plc.plcsimulate.entity.HeatRoom.HeatRoomStateEnum;

import java.util.ArrayList;
import java.util.List;

public class HeatRoomData {
    public static List<HeatRoomStateEnum> HeatRoomState;

    public HeatRoomData() {
        HeatRoomState = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            HeatRoomState.add(HeatRoomStateEnum.Free);
        }
    }
}
