package com.yc.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	private List<String> name = new ArrayList<String>();
	private Set<String> nameset = new HashSet<String>();
	
	private Map<String, String> map = new HashMap<String,String>();
	private Properties props = new Properties();

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Set<String> getNameset() {
		return nameset;
	}

	public void setNameset(Set<String> nameset) {
		this.nameset = nameset;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "CollectionBean [name=" + name + ", nameset=" + nameset + ", map=" + map + ", props=" + props + "]";
	}

	
	
	
	
	
}
