package assignments;

public class Assignment3_EmpGroups {
	static int [] emp_id=new int[3];
	static String [] emp_name= new String[3];

	public static void main(String[] args) {
	
		emp_id [0]=Assignment3_Employees.employee_id1;
		emp_id [1]=Assignment3_Employees.employee_id2;
		emp_id [2]=Assignment3_Employees.employee_id3;
		emp_name[0]=Assignment3_Employees.employee_name1;
		emp_name[1]=Assignment3_Employees.employee_name2;
		emp_name[2]=Assignment3_Employees.employee_name3;
		
		System.out.println("Employee Name: "+emp_name[0]+", Employee ID: "+emp_id [0]);
		System.out.println("Employee Name: "+emp_name[1]+", Employee ID: "+emp_id [1]);
		System.out.println("Employee Name: "+emp_name[2]+", Employee ID: "+emp_id [2]);

	}

}
