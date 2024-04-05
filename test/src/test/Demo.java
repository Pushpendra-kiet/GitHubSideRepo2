package test;
class Employee
{
	private int eid;
	private String name;
	private int sal;
	private String dept;
	
	public Employee(int eid) {
		super();
		this.eid = eid;
	}
	public Employee(int eid, String name) {
		this(eid);
		this.name = name;
	}
	public Employee(int eid, String name, String dept) {
		this(eid, name);
		this.dept = dept;
	}
	public Employee(int eid, String name, String dept, int sal) {
		this(eid, name,dept);
		this.sal = sal;
	}
	
	
	
}
public class Demo {

	public static void main(String[] args) {
		

	}

}
