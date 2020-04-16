package com.lwz.design_pattern.observer;

/**
 * @author lwz
 * @createTime 2020-04-16 14:22
 * @desc
 */
public class Student implements RingsObserver {
  @Override
  public void alarmClockRing(String timePoint) {
    if(TimePoint.TIME_POINT_EIGHT.equals(timePoint)){
      System.out.println("8点了，学生该上学了");
      return;
    }
  }
}
