package com.lwz.design_pattern.visitor;

/**
 * @author lwz
 * @createTime 2020-04-21 11:31
 * @desc
 */
public class Computer {
  private CPU cpu = new CPU();
  private Memory memory = new Memory();
  private Screen screen = new Screen();

  public Computer accept(Visitor visitor) {
    this.cpu.accept(visitor);
    this.memory.accept(visitor);
    this.screen.accept(visitor);
    return this;
  }
}
