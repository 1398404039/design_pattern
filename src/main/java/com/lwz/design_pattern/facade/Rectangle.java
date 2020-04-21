package com.lwz.design_pattern.facade;

/**
 * @author lwz
 * @createTime 2020-04-21 15:15
 * @desc
 */
public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Rectangle::draw()");
  }
}
