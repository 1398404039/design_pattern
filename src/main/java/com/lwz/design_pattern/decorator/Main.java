package com.lwz.design_pattern.decorator;

/**
 * @author lwz
 * @createTime 2020-04-14 16:02
 * @desc
 */
public class Main {
  public static void main(String[] args) {
    IPerson person = new LwzPerson();
    person = new DecoratorBlueJeans(person);
    person = new DecoratorRedHair(person);
    System.out.println("我看到一个" + person.printI());
  }
}
