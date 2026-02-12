package inheritances;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to call parent class constructor using super.
		/*Employee emp = new Employee(1, "IT", 35, "Abubakar");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());*/
		
		//Write a program to access parent class method from child class.
		//System.out.println(emp.getDeptId());
		
		//Write a program to access parent class variable using super.
		//System.out.println(emp.getDeptName());
		
		//Write a program to override a method in child class.
		/*ChildClass c = new ChildClass();
		c.print();*/
		
		//Write a program to demonstrate method hiding using static methods.
		/*ChildClass.methodHiding();
		ParentCLass.methodHiding();
		ChildClass c = new ChildClass();
		c.methodHiding();
		ParentCLass p = new ParentCLass();
		p.methodHiding();
		ParentCLass pc = new ChildClass();
		pc.methodHiding();
		pc = new ChildClass();
		pc.methodHiding();*/
		
		//Write a program to demonstrate HAS-A relationship.
		Car car = new Car();
		car.moving();
		
	}

}
