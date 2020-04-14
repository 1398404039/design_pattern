package com.lwz.design_pattern.decorator;

/**
 * @author lwz
 * @createTime 2020-04-14 16:00
 * @desc 这里是穿蓝色牛仔裤的人
 */
public class DecoratorBlueJeans implements IPerson {

  private IPerson person;

  public DecoratorBlueJeans(IPerson person) {
    this.person = person;
  }

  @Override
  public String printI() {
    return "穿着蓝色牛仔裤的" + person.printI();
  }
}
