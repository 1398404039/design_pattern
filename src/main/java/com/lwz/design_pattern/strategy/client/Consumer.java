package com.lwz.design_pattern.strategy.client;


import com.lwz.design_pattern.strategy.inter.DiscountStrategy;
import com.lwz.design_pattern.util.PropertiesUtil;

/**
 * @author lwz
 * @createTime 2020-04-13 17:30
 * @desc
 */
public class Consumer {
  public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    int originalPrice = 100;
    String strategyName = "discount.default";
    String discountName = PropertiesUtil.getProperty(strategyName);
    DiscountStrategy strategy = (DiscountStrategy) Class.forName(discountName).newInstance();
    System.out.println(strategy.getDiscountMoney(originalPrice));
  }
}
