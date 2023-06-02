package org.designpattern.strategy;

/**
 * @Author: ybchen
 * @Date: 2023/6/1 16:41
 */
public class Client {

    public static void main(String[] args) {
        String strategyId="12345";
        String fee="fee";
        Strategy strategy=StrategyManager.getStrategy(strategyId);
        System.out.println(strategy.parseElecFee(fee));
        System.out.println(strategy.parseServiceFee(fee));
         strategyId="abcde";
         fee="fee";
        strategy=StrategyManager.getStrategy(strategyId);
        System.out.println(strategy.parseElecFee(fee));
        System.out.println(strategy.parseServiceFee(fee));
    }
}
