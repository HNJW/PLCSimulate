package com.plc.plcsimulate.service.impl;

import com.plc.plcsimulate.entity.HeatRoom.HeatRoomControlEnum;
import com.plc.plcsimulate.entity.HeatRoom.HeatRoomControlResultCodeEnum;
import com.plc.plcsimulate.entity.HeatRoom.HeatRoomStateEnum;
import com.plc.plcsimulate.service.HeatRoomService;

import static com.plc.plcsimulate.PLCMemorySimulate.HeatRoom.HeatRoomData.HeatRoomState;

public class HeatRoomServiceImpl implements HeatRoomService {
    @Override
    // 获取加热房状态
    public HeatRoomStateEnum getHeatRoomState(Integer heatRoomId) {
        return HeatRoomState.get(heatRoomId);
    }

    @Override
    // 开始加热
    public void startHeat(HeatRoomControlEnum instruction, Integer heatRoomId, double temperature) throws Exception {
        if (instruction != HeatRoomControlEnum.StartHeat) {
            throw new Exception();
        }
        HeatRoomState.set(heatRoomId, HeatRoomStateEnum.Heating);
        System.out.println("开始加热");
    }

    @Override
    // 停止加热
    public void endHeat(HeatRoomControlEnum instruction, Integer heatRoomId) throws Exception {
        if (instruction != HeatRoomControlEnum.EndHeat) {
            throw new Exception();
        }
        HeatRoomState.set(heatRoomId, HeatRoomStateEnum.Free);
        System.out.println("停止加热");
    }

    @Override
    // 获取加热结果
    public HeatRoomControlResultCodeEnum getHeatRoomResult(Integer heatRoomId) {
        return HeatRoomControlResultCodeEnum.HeatSuccess;
    }

    @Override
    // 开始保温
    public void startInsulation(HeatRoomControlEnum instruction, Integer heatRoomId) throws Exception {
        if (instruction != HeatRoomControlEnum.StartInsulation) {
            throw new Exception();
        }
        HeatRoomState.set(heatRoomId, HeatRoomStateEnum.Insulation);
        System.out.println("开始保温");
    }

    @Override
    // 停止保温
    public void endInsulation(HeatRoomControlEnum instruction, Integer heatRoomId) throws Exception {
        if (instruction != HeatRoomControlEnum.EndInsulation) {
            throw new Exception();
        }
        HeatRoomState.set(heatRoomId, HeatRoomStateEnum.Free);
        System.out.println("停止保温");
    }
}
