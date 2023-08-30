package com.plc.plcsimulate;

import com.plc.plcsimulate.PLCMemorySimulate.ClosingArea.ClosingAreaData;
import com.plc.plcsimulate.PLCMemorySimulate.ModelingLine.ModelingLineData;
import com.plc.plcsimulate.PLCMemorySimulate.SandBoxModel.SandBoxModelData;
import com.plc.plcsimulate.entity.ClosingArea.ClosingAreaSandBoxArriveEnum;
import com.plc.plcsimulate.entity.ModelingLine.ModelingLineSandBoxModelArriveEnum;
import com.plc.plcsimulate.entity.SandBoxModel.sandBoxModelSearchEnum;
import com.plc.plcsimulate.entity.SandBoxModel.sandBoxModelSearchResultCodeEnum;
import com.plc.plcsimulate.service.impl.ClosingAreaServiceImpl;
import com.plc.plcsimulate.service.impl.ModelingLineServiceImpl;
import com.plc.plcsimulate.service.impl.SandBoxModelServiceImpl;
import com.plc.plcsimulate.util.InstructionCodeUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sun.applet.Main;

import java.time.LocalDateTime;
import java.util.Date;

@SpringBootTest
class PlcSimulateApplicationTests {
    @Test
    void InstructionCodeGenerateCodeUtilTest() {
        String code = InstructionCodeUtil.GenerateCode(11, 1);
        System.out.println(code);
        System.out.println((int) 5.6);
    }

    @Test
    void SandBoxModelServiceImplTest() throws Exception {
        SandBoxModelData sandBoxModelData = new SandBoxModelData();
        SandBoxModelServiceImpl sandBoxModelService = new SandBoxModelServiceImpl();
        sandBoxModelSearchResultCodeEnum codeEnum = sandBoxModelService.searchSandBox(sandBoxModelSearchEnum.SandBoxSearch, 9, 1);
        System.out.println(codeEnum.getValue());
    }

    @Test
    void ModelingLineServiceImplTest() throws Exception {
        ModelingLineData modelingLineData = new ModelingLineData();
        ModelingLineServiceImpl modelingLineService = new ModelingLineServiceImpl();
        modelingLineService.MoldArrive(ModelingLineSandBoxModelArriveEnum.ModelArrive, "1", "1", "1");
        Thread.sleep(1000000);
    }

    @Test
    void ClosingAreaServiceImplTest() throws Exception {
        ClosingAreaData closingAreaData = new ClosingAreaData();
        ClosingAreaServiceImpl closingAreaService = new ClosingAreaServiceImpl();
        closingAreaService.SandBoxArrive(ClosingAreaSandBoxArriveEnum.SandBoxArrive,"1","1","1");
        Thread.sleep(1000000);
    }
}
