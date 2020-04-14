package com.lwz.design_pattern.decorator;

/**
 * @author lwz
 * @createTime 2020-04-14 15:57
 * @desc 这里是染着红头发的人
 */
public class DecoratorRedHair implements IPerson {

  private IPerson person;

  public DecoratorRedHair(IPerson person) {
    this.person = person;
  }

  @Override
  public String printI() {
    return "染着红头发的" + person.printI();
  }
}
