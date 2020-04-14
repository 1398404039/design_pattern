package com.lwz.design_pattern.singleton;

/**
 * @author lwz
 * @createTime 2020-04-13 14:19
 * @desc 枚举单例，不仅可以解决线程同步问题，还可以防止反序列化
 */
public enum  Singleton02 {
  INSTANCE;

  public static void main(String[] args) {
    System.out.println(Singleton02.INSTANCE);
  }
}
