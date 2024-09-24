package com.pack.collection.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionExample {
	private List nameList;
	private Map nameMap;
	private Set nameSet;
	private Properties nameProperty;
	public List getNameList() {
		return nameList;
	}
	public void setNameList(List nameList) {
		this.nameList = nameList;
	}
	public Map getNameMap() {
		return nameMap;
	}
	public void setNameMap(Map nameMap) {
		this.nameMap = nameMap;
	}
	public Set getNameSet() {
		return nameSet;
	}
	public void setNameSet(Set nameSet) {
		this.nameSet = nameSet;
	}
	public Properties getNameProperty() {
		return nameProperty;
	}
	public void setNameProperty(Properties nameProperty) {
		this.nameProperty = nameProperty;
	}
	
}