package com.lwz.design_pattern.builder;

import org.springframework.util.StringUtils;

/**
 * @author lwz
 * @createTime 2020-04-14 13:35
 * @desc
 */
public class PersonBuilderProduct implements PersonBuilder {

  Person person = new Person();

  @Override
  public PersonBuilder buildTrunk(String trunk) {
    person.trunk = StringUtils.isEmpty(trunk) ? new Trunk() : new Trunk(trunk);
    return this;
  }

  @Override
  public PersonBuilder buildHead(String hairColor) {
    person.head = StringUtils.isEmpty(hairColor) ? new Head() : new Head(hairColor);
    return this;
  }

  @Override
  public PersonBuilder buildArm(String armLength) {
    person.arm = StringUtils.isEmpty(armLength) ? new Arm() : new Arm(armLength);
    return this;
  }

  @Override
  public PersonBuilder buildLeg(String legLength) {
    person.leg = StringUtils.isEmpty(legLength) ? new Leg() : new Leg(legLength);
    return this;
  }

  @Override
  public Person build() {
    return person;
  }
}
