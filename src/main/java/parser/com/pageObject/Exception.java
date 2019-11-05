package parser.com.pageObject;

public class Exception {

	String message;
	String full_stacktrace;
	String Class_;
	
	
	
	
	
	
	public String getClass_() {
		return Class_;
	}
	public void setClass_(String class1) {
		Class_ = class1;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getFull_stacktrace() {
		return full_stacktrace;
	}
	public void setFull_stacktrace(String full_stacktrace) {
		this.full_stacktrace = full_stacktrace;
	}
	@Override
	public String toString() {
		return "Exception [message=" + message + ", full_stacktrace="
				+ full_stacktrace + ", Class_=" + Class_ + "]";
	}

	
	
	
	
}
