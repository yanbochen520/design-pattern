package org.ybchen1.strategy;

/**
 * @Author: ybchen
 * @Date: 2023/6/1 16:28
 */
public interface Strategy {

     String parseServiceFee(String  fee);
     String parseElecFee(String  fee);
}
