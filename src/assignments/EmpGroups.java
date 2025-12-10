package assignments;

public class EmpGroups extends Employees{
	static int [] emp_id=new int[3];
	static String [] emp_name= new String[3];

	public static void main(String[] args) {
	
		//EmpGroups obj2 =new EmpGroups();
		emp_id [0]=Employees.employee_id1;
		emp_id [1]=Employees.employee_id2;
		emp_id [2]=Employees.employee_id3;
		emp_name[0]=Employees.employee_name1;
		emp_name[1]=Employees.employee_name2;
		emp_name[2]=Employees.employee_name3;
		
		System.out.println("Employee Name: "+emp_name[0]+", Employee ID: "+emp_id [0]);
		System.out.println("Employee Name: "+emp_name[1]+", Employee ID: "+emp_id [1]);
		System.out.println("Employee Name: "+emp_name[2]+", Employee ID: "+emp_id [2]);

	}

}
