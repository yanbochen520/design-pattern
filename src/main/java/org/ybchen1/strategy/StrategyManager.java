package org.ybchen1.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ybchen
 * @Date: 2023/6/1 16:37
 */
public class StrategyManager {

    public static Map<String,Strategy> strategyMap=new HashMap<>();
    static {
        strategyMap.put("12345",new ConcreteStrategyI());
        strategyMap.put("abcde",new ConcreteStrategyII());

    }

    public static Strategy getStrategy(String strategyId){
        return strategyMap.getOrDefault(strategyId,new ConcreteStrategyI());
    }
}
