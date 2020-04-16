package com.lwz.design_pattern.observer;

/**
 * @author lwz
 * @createTime 2020-04-16 14:22
 * @desc
 */
public class Dad implements RingsObserver {
  @Override
  public void alarmClockRing(String timePoint) {
    if(TimePoint.TIME_POINT_NINE.equals(timePoint)){
      System.out.println("9点了，爸爸该上班了");
      return;
    }
  }
}
