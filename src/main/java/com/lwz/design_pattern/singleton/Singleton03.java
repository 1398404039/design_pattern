package com.lwz.design_pattern.singleton;

/**
 * @author lwz
 * @createTime 2020-04-13 14:21
 * @desc 双层检查机制
 * 这种是线程安全的懒汉式加载模式，虽然达到了按需初始化的目的，通过synchronized，降低了效率
 */
public class Singleton03 {

  private static Singleton03 INSTANCE;

  private Singleton03() {
  }

  public static Singleton03 getInstance() {
    if (null == INSTANCE) {
      synchronized (INSTANCE) {
        if (null == INSTANCE) {
          INSTANCE = new Singleton03();
        }
      }
    }
    return INSTANCE;
  }
}
