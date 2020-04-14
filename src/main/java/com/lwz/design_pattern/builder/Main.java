package com.lwz.design_pattern.builder;

/**
 * @author lwz
 * @createTime 2020-04-14 13:39
 * @desc
 */
public class Main {
  public static void main(String[] args) {
    PersonBuilder personBuilder = new PersonBuilderProduct();
    personBuilder.buildTrunk("胖").buildHead("红").buildArm("80").buildLeg("110").build();
  }
}
