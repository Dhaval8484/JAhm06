package EmpData;

import firstproject.Empdata;

public class Employee {

	public static void main(String[] args) {
		Empdata e1 = new Empdata();
		
		e1.setEmp_id(1);
		e1.setEmp_name("Ravan");
		
		System.out.println(e1);
		
		e1.setEmp_id(2);
		e1.setEmp_name("Dhaval");
		
		System.out.println(e1);
		

	}

}
