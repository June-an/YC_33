package com.yc.bean;

public class Pear {
	public Pear() {
		System.out.println("pear构造方法");
	}
	
	public void init(){
		System.out.println("初始化");
	}
	
	public void destroy(){
		System.out.println("销毁");
	}
}
