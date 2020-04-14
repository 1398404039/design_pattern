package com.lwz.design_pattern.decorator;


/**
 * @author lwz
 * @createTime 2020-04-14 15:56
 * @desc 我才是个人
 */
public class LwzPerson implements IPerson {
  @Override
  public String printI() {
    return "lwz";
  }
}
