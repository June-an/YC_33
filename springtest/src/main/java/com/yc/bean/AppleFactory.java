package com.yc.bean;

public class AppleFactory {
	 private  static Apple apple;
	 private AppleFactory() {}

	 public Apple createAppleInstance() {
		 apple = new Apple();
	     return apple;
	 }
}
