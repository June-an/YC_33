package com.yc.bean;


public class PersonBmiFilter implements Filter {

	@Override
	public boolean doCheck(Object obj) {
		if(  obj==null){
			return false;
		}
		if(   !(obj instanceof Person)){
			return false;
		}
		Person p=(Person)obj;
		
		if( p.getHeight()<0.5||p.getWeight()<3||p.getWeight()>400||p.getHeight()>2.5){
			return false;
		}
		
		return true;
	}

}
