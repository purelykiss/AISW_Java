package kr.ac.kopo.day12.extend;

public class Manager4 extends Employee{
	Employee[] empList;

	public Manager4() {
		super();
	}

	public Manager4(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}
	
	
}
