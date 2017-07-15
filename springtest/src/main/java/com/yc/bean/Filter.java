package com.yc.bean;
/**
 * 过滤接口
 */
public interface Filter {
	/**
	 * 测量 obj的值 是否在一定范围内，
	 * @param obj
	 * @return   值 合理，则返回true, 不合理则返回false
	 */
	public    boolean    doCheck(   Object obj);
}
