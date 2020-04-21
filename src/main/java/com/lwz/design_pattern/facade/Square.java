package com.lwz.design_pattern.facade;

/**
 * @author lwz
 * @createTime 2020-04-21 15:14
 * @desc
 */
public class Square implements Shape {
  @Override
  public void draw() {
    System.out.println("Square::draw()");
  }
}
