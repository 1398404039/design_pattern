package com.lwz.design_pattern.observer;

import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author lwz
 * @createTime 2020-04-16 14:15
 * @desc Source，事件源
 */
public class AlarmClock {
  private List<RingsObserver> observers;

  public List<RingsObserver> getObservers() {
    return observers;
  }

  public void setObservers(List<RingsObserver> observers) {
    this.observers = observers;
  }

  public void ring(String timePoint) {
    if (CollectionUtils.isEmpty(observers)) {
      return;
    }
    for (RingsObserver observer : observers) {
      observer.alarmClockRing(timePoint);
    }
  }
}
