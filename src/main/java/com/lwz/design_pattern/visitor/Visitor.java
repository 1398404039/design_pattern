package com.lwz.design_pattern.visitor;

public interface Visitor {
  double visitCPU(CPU cpu);
  double visitScreen(Screen screen);
  double visitMemory(Memory memory);
}
