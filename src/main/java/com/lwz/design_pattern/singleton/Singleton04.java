package com.lwz.design_pattern.singleton;

/**
 * @author lwz
 * @createTime 2020-04-13 14:24
 * @desc 静态内部类方式
 * jvm保证单例
 * 加载外部类是不会加载内部类，这样可以实现懒加载
 */
public class Singleton04 {
  private Singleton04() {
  }

  private static class Singleton04Holder {
    private static final Singleton04 INSTANCE = new Singleton04();
  }

  public static Singleton04 getInstance() {
    return Singleton04Holder.INSTANCE;
  }
}
