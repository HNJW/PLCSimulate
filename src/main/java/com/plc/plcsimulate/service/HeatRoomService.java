package com.plc.plcsimulate.service;

import com.plc.plcsimulate.entity.HeatRoom.HeatRoomControlEnum;
import com.plc.plcsimulate.entity.HeatRoom.HeatRoomControlResultCodeEnum;
import com.plc.plcsimulate.entity.HeatRoom.HeatRoomStateEnum;

public interface HeatRoomService {
    // 获取加热房状态
    HeatRoomStateEnum getHeatRoomState(Integer heatRoomId);
    // 开始加热
    void startHeat(HeatRoomControlEnum code, Integer heatRoomId, double temperature) throws Exception;
    // 停止加热
    void endHeat(HeatRoomControlEnum code, Integer heatRoomId) throws Exception;
    // 获取加热结果
    HeatRoomControlResultCodeEnum getHeatRoomResult(Integer heatRoomId);
    // 开始保温
    void startInsulation(HeatRoomControlEnum code, Integer heatRoomId) throws Exception;
    // 停止保温
    void endInsulation(HeatRoomControlEnum code, Integer heatRoomId) throws Exception;
}
