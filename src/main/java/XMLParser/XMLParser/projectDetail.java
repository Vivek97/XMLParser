package XMLParser.XMLParser;



public class projectDetail {
	
	private int project_id;
	
	private String pro_name;

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	// @OneToMany(mappedBy="projectDetail")
	// public List <TestingResult> Tstlist= new ArrayList<TestingResult>();

}
