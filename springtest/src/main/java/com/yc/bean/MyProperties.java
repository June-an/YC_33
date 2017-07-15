package com.yc.bean;

//单例模式，由碎片spring托管这个bean
public class MyProperties {
	private static MyProperties mp = new MyProperties();
	
	//单例：
	public MyProperties() {
		//写入业务代码，读取.properties的文件
	}
	
	public static MyProperties getInstance(){
		if(mp==null){
			mp = new MyProperties();
		}
		return mp;
	}

}
