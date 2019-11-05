package parser.com.pageObject;

import java.util.ArrayList;

public class Test {

	String name;
	String duration_ms;
	String started_at;
	public ArrayList<Class> getClassList() {
		return classList;
	}
	public void setClassList(Class cls) {
		this.classList.add(cls);
	}
	String finished_at;
	ArrayList <Class> classList= new ArrayList<>();
	
	@Override
	public String toString() {
		return "Test [name=" + name + ", duration_ms=" + duration_ms
				+ ", started_at=" + started_at + ", finished_at=" + finished_at
				+ ", classList=" + classList + "]";
	}
	
	public String getName() {
		return name;
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

	
	
}
