package com.lwz.design_pattern.singleton;

/**
 * @author lwz
 * @createTime 2020-04-13 14:16
 * @desc 饿汉式加载模式
 * 类加载到内存后，就实例化一个单例，jvm保证线程安全
 * 简单实用，推荐
 * 缺点：不管是否需要，类装载时就完成了实例化
 */
public class Singleton01 {
  private static final Singleton01 INSTANCE = new Singleton01();

  /**
   * 另一种写法，没啥区别
   */
//  private static Singleton01 INSTANCE;
//  static {
//    INSTANCE = new Singleton01();
//  }

  private Singleton01() {
  }

  public static Singleton01 getInstance() {
    return INSTANCE;
  }

  public static void main(String[] args) {
    Singleton01 s1 = getInstance();
    Singleton01 s2 = getInstance();
    System.out.println(s1 == s2);
  }
}
