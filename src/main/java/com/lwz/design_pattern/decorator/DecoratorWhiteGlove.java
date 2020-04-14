package com.lwz.design_pattern.decorator;

/**
 * @author lwz
 * @createTime 2020-04-14 16:01
 * @desc
 */
public class DecoratorWhiteGlove implements IPerson {
  private IPerson person;

  public DecoratorWhiteGlove(IPerson person) {
    this.person = person;
  }


  @Override
  public String printI() {
    return "带着红手套的" + person.printI();
  }
}
