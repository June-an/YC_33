package com.yc.bean;

public class ConstructorDi {
	private int x;
	private String y;
	private Apple apple;
	
	
	public ConstructorDi(int x, String y, Apple apple) {
		super();
		this.x = x;
		this.y = y;
		this.apple = apple;
		
		System.out.println("ConstructorDi的构造方法");
	}
	@Override
	public String toString() {
		return "ConstructorDi [x=" + x + ", y=" + y + ", apple=" + apple + "]";
	}
	
	
	
	
	
}
