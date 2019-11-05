package XMLParser.XMLParser;

import java.util.ArrayList;
import java.util.List;



import parser.com.pageObject.Suite;

public class TestingResult {


	private int tst_res_id;
	// String Reporter_output;
	
	private int skipped;
	
	private int failed;
	
	private int total;

	public int getTst_res_id() {
		return tst_res_id;
	}

	public void setTst_res_id(int tst_res_id) {
		this.tst_res_id = tst_res_id;
	}

	public int getSkipped() {
		return skipped;
	}

	public void setSkipped(int skipped) {
		this.skipped = skipped;
	}

	public int getFailed() {
		return failed;
	}

	public void setFailed(int failed) {
		this.failed = failed;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPassed() {
		return passed;
	}

	public void setPassed(int passed) {
		this.passed = passed;
	}

	public List<Suite> getSuiteList() {
		return suiteList;
	}

	public void setSuiteList(List<Suite> suiteList) {
		this.suiteList = suiteList;
	}

	public projectDetail getPro() {
		return pro;
	}

	public void setPro(projectDetail pro) {
		this.pro = pro;
	}


	private int passed;

	private List<Suite> suiteList = new ArrayList<Suite>();

	private projectDetail pro;

}
