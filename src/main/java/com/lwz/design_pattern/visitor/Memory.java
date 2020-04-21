package com.lwz.design_pattern.visitor;

/**
 * @author lwz
 * @createTime 2020-04-21 11:26
 * @desc
 */
public class Memory extends ComputerPart {
  @Override
  void accept(Visitor visitor) {
    visitor.visitMemory(this);
  }

  @Override
  double getPrice() {
    return 2000;
  }
}
