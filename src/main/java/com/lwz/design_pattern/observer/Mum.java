package com.lwz.design_pattern.observer;

/**
 * @author lwz
 * @createTime 2020-04-16 14:23
 * @desc
 */
public class Mum implements RingsObserver {
  @Override
  public void alarmClockRing(String timePoint) {
    if(TimePoint.TIME_POINT_TEN.equals(timePoint)){
      System.out.println("10点了，妈妈约了去做美甲了");
      return;
    }
  }
}
