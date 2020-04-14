package com.lwz.design_pattern.strategy.inter;

/**
 * @author lwz
 * @createTime 2020-04-13 17:14
 * @desc
 */
public interface DiscountStrategy {

  /**
   * 获取优惠后价格数字
   * @param originalPrice
   * @return
   */
  int getDiscountMoney(int originalPrice);
}
