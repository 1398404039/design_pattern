package com.lwz.design_pattern.strategy.impl;

import com.lwz.design_pattern.strategy.inter.DiscountStrategy;

/**
 * @author lwz
 * @createTime 2020-04-13 17:25
 * @desc
 */
public class FullEightMinusOneDiscount implements DiscountStrategy {
  @Override
  public int getDiscountMoney(int originalPrice) {
    return originalPrice >= 8 ? (originalPrice - 1) : originalPrice;
  }
}
