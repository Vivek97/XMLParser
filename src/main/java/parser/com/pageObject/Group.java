package parser.com.pageObject;

import java.util.ArrayList;

public class Group {
	
	ArrayList<Test> group_testList = new ArrayList<>();

	public ArrayList<Test> getGroup_testList() {
		return group_testList;
	}

	public void setGroup_testList(Test group_test) {
		this.group_testList.add(group_test);
	}

	@Override
	public String toString() {
		return "Group [group_testList=" + group_testList + "]";
	}
	
	
	
	

}
