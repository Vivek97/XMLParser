package parser.com.pageObject;

import java.util.ArrayList;

public class TestMethod {
	
	String status;
	String signature;
	String name;
	String duration_ms;
	String started_at;
	String finished_at;
	
	ArrayList <Exception> excpList= new ArrayList<>();
	String report_output;
	
	
	 public ArrayList<Exception> getExcpList() {
			return excpList;
		}
		public void setExcpList(Exception excp) {
			this.excpList.add(excp);
		}
	
	
	
	
	
	
	
	

	@Override
		public String toString() {
			return "TestMethod [status=" + status + ", signature=" + signature
					+ ", name=" + name + ", duration_ms=" + duration_ms
					+ ", started_at=" + started_at + ", finished_at="
					+ finished_at + ", excpList=" + excpList
					+ ", report_output=" + report_output + "]";
		}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
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

	public String getReport_output() {
		return report_output;
	}
	public void setReport_output(String report_output) {
		this.report_output = report_output;
	}
	
	
	
	
	
	

}
