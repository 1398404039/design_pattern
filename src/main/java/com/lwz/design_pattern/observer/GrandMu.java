package com.lwz.design_pattern.observer;

/**
 * @author lwz
 * @createTime 2020-04-16 14:23
 * @desc
 */
public class GrandMu implements RingsObserver {
  @Override
  public void alarmClockRing(String timePoint) {
    if(TimePoint.TIME_POINT_SIX.equals(timePoint)){
      System.out.println("6点了，奶奶该起床去遛弯了");
      return;
    }
  }
}
