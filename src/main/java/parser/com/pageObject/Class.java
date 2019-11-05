package parser.com.pageObject;

import java.util.ArrayList;

public class Class {
	
	String name;
	ArrayList <TestMethod> tmList=new ArrayList<>();
	
	
	
	
	public ArrayList<TestMethod> getTmList() {
		return tmList;
	}
	
	@Override
	public String toString() {
		return "Class [name=" + name + ", tmList=" + tmList + "]";
	}
	public void setTmList(TestMethod tm) {
		this.tmList.add(tm);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



}
