package com.lwz.design_pattern.facade;

/**
 * @author lwz
 * @createTime 2020-04-21 15:18
 * @desc
 */
public class Main {
  public static void main(String[] args) {
    ShapeMaker maker = new ShapeMaker();
    maker.drawCircle();
    maker.drawRectangle();
    maker.drawSquare();
  }
}
