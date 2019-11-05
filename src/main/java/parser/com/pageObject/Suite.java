package parser.com.pageObject;

import java.util.ArrayList;

public class Suite {

	String name;
	String duration_ms;
	String started_at;
	String finished_at;
	ArrayList<Group> groupList= new ArrayList<>(); 
	ArrayList <Test> testList=new ArrayList<>();

	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Suite [name=" + name + ", duration_ms=" + duration_ms
				+ ", started_at=" + started_at + ", finished_at=" + finished_at
				+ ", groups=" + groupList + ", testList=" + testList + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration_ms() {
		return duration_ms;
	}
	public void setDuration_ms(String duration_ms) {
		this.duration_ms = duration_ms;
	}
	public String getStarted_at() {
		return started_at;
	}
	public void setStarted_at(String started_at) {
		this.started_at = started_at;
	}
	public String getFinished_at() {
		return finished_at;
	}
	public void setFinished_at(String finished_at) {
		this.finished_at = finished_at;
	}
	public ArrayList<Test> getTestList() {
		return testList;
	}
	
	public ArrayList<Group> getGroupList() {
		return groupList;
	}
	public void setGroupList(Group group) {
		this.groupList.add(group);
	}
	public void setTestList(Test test) {
		this.testList.add(test);
	}


    
	


}
