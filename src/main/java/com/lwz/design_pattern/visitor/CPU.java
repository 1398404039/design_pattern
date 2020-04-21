package com.lwz.design_pattern.visitor;

/**
 * @author lwz
 * @createTime 2020-04-21 11:24
 * @desc
 */
public class CPU extends ComputerPart {
  @Override
  void accept(Visitor visitor) {
    visitor.visitCPU(this);
  }

  @Override
  double getPrice() {
    return 800;
  }
}
