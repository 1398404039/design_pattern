package com.lwz.design_pattern.visitor;

/**
 * @author lwz
 * @createTime 2020-04-21 11:30
 * @desc
 */
public class BusinessVisitor implements Visitor {
  double totalPrice = 0;
  @Override
  public double visitCPU(CPU cpu) {
    return totalPrice += cpu.getPrice() * 0.60;
  }

  @Override
  public double visitScreen(Screen screen) {
    return totalPrice += screen.getPrice() * 0.60;
  }

  @Override
  public double visitMemory(Memory memory) {
    return totalPrice += memory.getPrice() * 0.60;
  }
}
