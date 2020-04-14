package com.lwz.design_pattern.builder;

public interface PersonBuilder {
  /**
   * 构建躯干
   * @param trunk
   * @return
   */
  PersonBuilder buildTrunk(String trunk);

  /**
   * 构建脑袋
   * @param hairColor
   * @return
   */
  PersonBuilder buildHead(String hairColor);

  /**
   * 构建胳膊
   * @param armLength
   * @return
   */
  PersonBuilder buildArm(String armLength);

  /**
   * 构建腿
   * @param legLength
   * @return
   */
  PersonBuilder buildLeg(String legLength);

  /**
   * 返回构建拼凑的实体
   * @return
   */
  Person build();
}
