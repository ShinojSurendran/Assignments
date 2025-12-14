package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4 {

	public static void main(String[] args) {
		/*
		 * Inside this Excel There are 3 TestCases with each TestCase having 3 rows of data. 
		 * Now, Create Map<String, Map<String,String>> to store all the data and 
		 * Print the data from Product details > Supplier Name > Office Depot  from the   Map<String, Map<String,String>>
		 */
		
		// Below Student1Map details are stored using Map(HashMap)
		Map<String, String> Student1Map = new HashMap<String, String>();
		Student1Map.put("Name", "John Doe");
		Student1Map.put("Age", "Twenty");
		Student1Map.put("Gender", "Male");
		Student1Map.put("Roll Number", "SBA12345");
		Student1Map.put("Grade", "A++");
		Student1Map.put("Major", "Computer Science");
		Student1Map.put("GPA", "A3.8");
		Student1Map.put("Email", "john@example.com");
		Student1Map.put("PAN Number", "SDF6543210");
		Student1Map.put("Address", "123 Elm St");
		
		// Below Student2Map details are stored using Map(HashMap)
		Map<String, String> Student2Map = new HashMap<String, String>();
		Student2Map.put("Name", "Jane Smith");
		Student2Map.put("Age", "Twenty One");
		Student2Map.put("Gender", "Female");
		Student2Map.put("Roll Number", "SBA12346");
		Student2Map.put("Grade", "B+");
		Student2Map.put("Major", "Mathematics");
		Student2Map.put("GPA", "A3.5");
		Student2Map.put("Email", "jane@example.com");
		Student2Map.put("PAN Number", "REW6543211");
		Student2Map.put("Address", "456 Oak St");
		
		// Below Student3Map details are stored using Map(HashMap)
		Map<String, String> Student3Map = new HashMap<String, String>();
		Student3Map.put("Name", "Mike Brown");
		Student3Map.put("Age", "Twenty Two");
		Student3Map.put("Gender", "Male");
		Student3Map.put("Roll Number", "SBA12347");
		Student3Map.put("Grade", "A+");
		Student3Map.put("Major", "Physics");
		Student3Map.put("GPA", "A3.9");
		Student3Map.put("Email", "mike@example.com");
		Student3Map.put("PAN Number", "TYR6543212");
		Student3Map.put("Address", "789 Pine St");
		
		//Print Student 1, 2 and 3 details
		System.out.println("Student 1 details :" + Student1Map);
		System.out.println("Student 2 details :" + Student2Map);
		System.out.println("Student 3 details :" + Student3Map);
		System.out.println("*********************************************");
		
		// Student1Map,Student2Map,Student3Map details are added under List (studentList)
		List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
		studentList.add(Student1Map);
		studentList.add(Student1Map);
		studentList.add(Student3Map);
		System.out.println("Student List :" + studentList);
		System.out.println("*********************************************");
		
		// Below Employee1Map details are stored using Map(HashMap)
		Map<String, String> Employee1Map = new HashMap<String, String>();
		Employee1Map.put("Employee ID", "E001");
		Employee1Map.put("Name", "Alice Green");
		Employee1Map.put("Age", "Thirty");
		Employee1Map.put("Gender", "Female");
		Employee1Map.put("Department", "Engineering");
		Employee1Map.put("Position", "Software Engineer");
		Employee1Map.put("Salary", "75K Pounds");
		Employee1Map.put("Email", "alice@example.com");
		Employee1Map.put("Contact Number", "9876543213");
		// Below Employee2Map details are stored using Map(HashMap)

		Map<String, String> Employee2Map = new HashMap<String, String>();
		Employee2Map.put("Employee ID", "E002");
		Employee2Map.put("Name", "Bob Johnson");
		Employee2Map.put("Age", "Thirty Five");
		Employee2Map.put("Gender", "Male");
		Employee2Map.put("Department", "Marketing");
		Employee2Map.put("Position", "Marketing Manager");
		Employee2Map.put("Salary", "85K Pounds");
		Employee2Map.put("Email", "bob@example.com");
		Employee2Map.put("Contact Number", "9876543214");
		// Below Employee3Map details are stored using Map(HashMap)

		Map<String, String> Employee3Map = new HashMap<String, String>();
		Employee3Map.put("Employee ID", "E003");
		Employee3Map.put("Name", "Carol White");
		Employee3Map.put("Age", "Twenty Eight");
		Employee3Map.put("Gender", "Female");
		Employee3Map.put("Department", "Sales");
		Employee3Map.put("Position", "Sales Executive");
		Employee3Map.put("Salary", "65K Pounds");
		Employee3Map.put("Email", "carol@example.com");
		Employee3Map.put("Contact Number", "9876543215");
		
		//Print Employee 1, 2 and 3 details
		System.out.println("Employee 1 details :" + Employee1Map);
		System.out.println("Employee 2 details :" + Employee2Map);
		System.out.println("Employee 3 details :" + Employee3Map);
		System.out.println("*********************************************");
		
		// Employee1Map,Employee2Map,Employee3Map details are added under List (empList)
		List<Map<String, String>> empList = new ArrayList<Map<String, String>>();
		empList.add(Employee1Map);
		empList.add(Employee2Map);
		empList.add(Employee3Map);
		System.out.println("Employee List :" + empList);
		System.out.println("*********************************************");
		
		
		// Below Product1Map details are stored using Map(HashMap)
		Map<String, String> Product1Map = new HashMap<String, String>();
		Product1Map.put("Product ID", "P001");
		Product1Map.put("Name", "Laptop");
		Product1Map.put("Category", "Electronics");
		Product1Map.put("Price", "12K Pounds");
		Product1Map.put("Stock Quantity", "Not Available");
		Product1Map.put("Supplier", "Tech Supplies");
		Product1Map.put("Warranty", "2 years");
		Product1Map.put("Rating", "4.5 Stars");
		Product1Map.put("Manufacturing Date", "Aug 2023");
		Product1Map.put("Expiry Date", "Aug 2028");
		
		// Below Product2Map details are stored using Map(HashMap)

		Map<String, String> Product2Map = new HashMap<String, String>();
		Product2Map.put("Product ID", "P002");
		Product2Map.put("Name", "Desk Chair");
		Product2Map.put("Category", "Furniture");
		Product2Map.put("Price", "150K Pounds");
		Product2Map.put("Stock Quantity", "Two");
		Product2Map.put("Supplier", "Office Depot");
		Product2Map.put("Warranty", "1 year");
		Product2Map.put("Rating", "4 Stars");
		Product2Map.put("Manufacturing Date", "Sep 2024");
		Product2Map.put("Expiry Date", "N/A");

		// Below Product3Map details are stored using Map(HashMap)

		Map<String, String> Product3Map = new HashMap<String, String>();
		Product3Map.put("Product ID", "P003");
		Product3Map.put("Name", "Coffee Maker");
		Product3Map.put("Category", "Kitchen");
		Product3Map.put("Price", "75 Pounds");
		Product3Map.put("Stock Quantity", "Two Hundred");
		Product3Map.put("Supplier", "KitchenWorld");
		Product3Map.put("Warranty", "6 months");
		Product3Map.put("Rating", "4.2 Stars");
		Product3Map.put("Manufacturing Date", "Jan 2025");
		Product3Map.put("Expiry Date", "Jan 2027");

		
		//Print Product  1, 2 and 3 details
		System.out.println("Product 1 details :" + Product1Map);
		System.out.println("Product 2 details :" + Product2Map);
		System.out.println("Product 3 details :" + Product3Map);
		System.out.println("*********************************************");
		
		
		// Product1Map,Product1Map,Product1Map details are added under List (productList)

		List<Map<String, String>> productList = new ArrayList<Map<String, String>>();
		productList.add(Product1Map);
		productList.add(Product2Map);
		productList.add(Product3Map);
		System.out.println("Product List :" + productList);
		System.out.println("*********************************************");
		
		
		// To access all data of studentList,empList,productList are mapped under Map(HashMap)

		Map<String, List<Map<String, String>>> data = new HashMap<String, List<Map<String, String>>>();
		data.put("StudentData", studentList);
		data.put("EmployeeData", empList);
		data.put("ProductData", productList);
		System.out.println("All Data List :" + data);
		System.out.println("***********************************************************");
		System.out.println("Supplier Name of 2nd row of ProductData: "+ data.get("ProductData").get(1).get("Supplier"));

				
		
	}

}
