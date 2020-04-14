package com.lwz.design_pattern.strategy.impl;


import com.lwz.design_pattern.strategy.inter.DiscountStrategy;

/**
 * @author lwz
 * @createTime 2020-04-13 17:23
 * @desc
 */
public class FullTenMinusTwoDiscount implements DiscountStrategy {

  @Override
  public int getDiscountMoney(int originalPrice) {
    return originalPrice >= 10 ? (originalPrice - 2) : originalPrice;
  }
}
