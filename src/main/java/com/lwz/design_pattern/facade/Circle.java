package com.lwz.design_pattern.facade;

/**
 * @author lwz
 * @createTime 2020-04-21 15:14
 * @desc
 */
public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Circle::draw()");
  }
}
