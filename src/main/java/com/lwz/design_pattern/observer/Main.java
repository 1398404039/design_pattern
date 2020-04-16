package com.lwz.design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwz
 * @createTime 2020-04-16 14:27
 * @desc
 */
public class Main {
  public static void main(String[] args) {
    // 监听者注册到这里
    List<RingsObserver> observerList = new ArrayList<>();
    observerList.add(new Dad());
    observerList.add(new Mum());
    observerList.add(new Student());
    observerList.add(new GrandMu());
    AlarmClock clock = new AlarmClock();
    clock.setObservers(observerList);

    // 添加事件点
    List<String> list = new ArrayList<>();
    list.add(TimePoint.TIME_POINT_SIX);
    list.add(TimePoint.TIME_POINT_EIGHT);
    list.add(TimePoint.TIME_POINT_NINE);
    list.add(TimePoint.TIME_POINT_TEN);

    for (String timePoint : list) {
      clock.ring(timePoint);
    }
  }
}

