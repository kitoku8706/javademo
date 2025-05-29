package java021_jdbc.part02;

//DTO : Data Transfer Object
//VO : Variable Object
//Entity


public class DepartmentsDTO {
	private int department_id;
	private String department_name;
	private int manager_id;
	private int locatino_id;
	
	public DepartmentsDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getLocatino_id() {
		return locatino_id;
	}

	public void setLocatino_id(int locatino_id) {
		this.locatino_id = locatino_id;
	}
	
	

}
