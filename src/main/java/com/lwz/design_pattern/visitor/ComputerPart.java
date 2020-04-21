package com.lwz.design_pattern.visitor;

/**
 * @author lwz
 * @createTime 2020-04-21 11:21
 * @desc
 */
public abstract class ComputerPart {
  abstract void accept(Visitor visitor);
  abstract double getPrice();
}
