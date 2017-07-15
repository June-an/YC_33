package com.yc.bean;

import java.util.Random;

//产品
public class Apple {
	private int id;

	public int getId() {
		Random r = new Random();
		id = r.nextInt(99999);
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
