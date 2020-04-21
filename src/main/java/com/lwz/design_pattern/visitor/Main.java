package com.lwz.design_pattern.visitor;

/**
 * @author lwz
 * @createTime 2020-04-21 11:39
 * @desc
 */
public class Main {
  public static void main(String[] args) {
    PersonalVisitor visitor = new PersonalVisitor();
    new Computer().accept(visitor);
    System.out.println(visitor.totalPrice);

    BusinessVisitor visitor1 = new BusinessVisitor();
    new Computer().accept(visitor1);
    System.out.println(visitor1.totalPrice);
  }
}
