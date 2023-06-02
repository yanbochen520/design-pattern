package org.designpattern.strategy;

/**
 * @Author: ybchen
 * @Date: 2023/6/1 16:30
 */
public class ConcreteStrategyI implements Strategy{
    @Override
    public String parseServiceFee(String fee) {
        return "ConcreteStrategyI"+"service"+fee;
    }

    @Override
    public String parseElecFee(String fee) {
        return "ConcreteStrategyI"+"elec"+fee;
    }
}
