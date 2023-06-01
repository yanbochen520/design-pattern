package org.ybchen1.strategy;

/**
 * @Author: ybchen
 * @Date: 2023/6/1 16:33
 */
public class ConcreteStrategyII implements Strategy{
    @Override
    public String parseServiceFee(String fee) {
        return "ConcreteStrategyII"+"service"+fee;
    }

    @Override
    public String parseElecFee(String fee) {
        return "ConcreteStrategyII"+"elec"+fee;
    }
}
