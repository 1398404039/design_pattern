package com.lwz.design_pattern.visitor;

/**
 * @author lwz
 * @createTime 2020-04-21 11:26
 * @desc
 */
public class Screen extends ComputerPart {
  @Override
  void accept(Visitor visitor) {
    visitor.visitScreen(this);
  }

  @Override
  double getPrice() {
    return 200;
  }
}
