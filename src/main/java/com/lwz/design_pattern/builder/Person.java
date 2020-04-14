package com.lwz.design_pattern.builder;

import java.io.Serializable;

/**
 * @author lwz
 * @createTime 2020-04-14 13:17
 * @desc
 */
public class Person implements Serializable {
  Trunk trunk;
  Head head;
  Arm arm;
  Leg leg;
}

/**
 * 躯干，这里只关注胖瘦
 */
class Trunk {
  private String trunk;

  public Trunk(String trunk) {
    System.out.println("这里是指定的躯体：" + trunk);
    this.trunk = trunk;
  }

  public Trunk() {
    System.out.println("这里是默认的躯体");
  }
}

/**
 * 头，这里只关注头发颜色
 */
class Head {
  private String hairColor;

  public Head() {
    System.out.println("这里是默认的头发颜色");
  }

  public Head(String hairColor) {
    System.out.println("这里是指定的头发颜色：" + hairColor);
    this.hairColor = hairColor;
  }
}

/**
 * 胳膊，这里只关注 胳膊长度
 */
class Arm {
  private String armLength;

  public Arm() {
    System.out.println("这里是默认的胳膊");
  }

  public Arm(String armLength) {
    this.armLength = armLength;
    System.out.println("这里是指定长度的胳膊：" + armLength);
  }
}

/**
 * 腿，这里只关注 腿的长度
 */
class Leg {
  private String legLength;

  public Leg() {
    System.out.println("这里是默认的腿");
  }

  public Leg(String legLength) {
    this.legLength = legLength;
    System.out.println("这里是指定长度的腿：" + legLength);
  }
}
