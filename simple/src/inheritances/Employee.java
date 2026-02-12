package inheritances;

public class Employee extends Department {

	private int empId;
	private String empName;
	
	public Employee(int id,String name,int empId,String empName) {
		super(id,name);
		this.empId = empId;
		this.empName = empName;
	}
	
	public int getEmpId() {
		return this.empId;
	}
	
	public String getEmpName() {
		return this.empName;
	}
	
	public int getDeptId() {
		return super.getId();
	}
	
	public String getDeptName() {
		return super.name;
	}
	

	
}
