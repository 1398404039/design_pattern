package com.lwz.design_pattern.decorator;

/**
 * @author lwz
 * @createTime 2020-04-14 16:01
 * @desc 这里是带着白手套的人
 */
public class DecoratorWhiteGlove implements IPerson {
  private IPerson person;

  public DecoratorWhiteGlove(IPerson person) {
    this.person = person;
  }


  @Override
  public String printI() {
    return "带着白手套的" + person.printI();
  }
}
