package assignments;

public class Assignment2_Arrays2 {

	public static void main(String[] args) {
		/*
		 *  Problem: Multi-Dimensional Array Practice 
		1. Create a 3D array to represent the following data: 
			o Semesters as the first dimension. 
			o Subjects and Status/Marks as the second dimension. 
			o Actual values for Subject Names and Marks as the third dimension. 
		2. From the array: 
			o Print Semester 2 Subject 4 and Subject 5 names. 
			o Print the Status/Marks of Semester 4 Subject 3 and Subject 6. 
		 */	
		
		String[][][] result = new String[5][3][6];
		
		// Semester 1
		
				result[0][0][0] = "Mathematics I";
				result[0][0][1] = "Physics";
				result[0][0][2] = "Chemistry";
				result[0][0][3] = "Computer Programming";
				result[0][0][4] = "Engineering Drawing";
				result[0][0][5] = "Basic Electrical Eng.";
				
				result[0][1][0] = "Pass";
				result[0][1][1] = "Pass";
				result[0][1][2] = "Fail";
				result[0][1][3] = "Pass";
				result[0][1][4] = "Pass";
				result[0][1][5] = "Pass";
				
				result[0][2][0] = "78";
				result[0][2][1] = "85";
				result[0][2][2] = "21";
				result[0][2][3] = "74";
				result[0][2][4] = "88";
				result[0][2][5] = "79";
				

		// Semester 2
				result[1][0][0] = "Mathematics II";
				result[1][0][1] = "Mechanics";
				result[1][0][2] = "Environmental Sci.";
				result[1][0][3] = "Basic Electronics";
				result[1][0][4] = "Engineering Physics";
				result[1][0][5] = "Engineering Graphics";
				
				result[1][1][0] = "Pass";
				result[1][1][1] = "Pass";
				result[1][1][2] = "Pass";
				result[1][1][3] = "Fail";
				result[1][1][4] = "Fail";
				result[1][1][5] = "Pass";
				
				result[1][2][0] = "82";
				result[1][2][1] = "77";
				result[1][2][2] = "93";
				result[1][2][3] = "19";
				result[1][2][4] = "24";
				result[1][2][5] = "90";
				

		// Semester 3
				result[2][0][0] = "result Structures";
				result[2][0][1] = "Discrete Mathematics";
				result[2][0][2] = "Digital Electronics";
				result[2][0][3] = "Operating Systems";
				result[2][0][4] = "Signals and Systems";
				result[2][0][5] = "Object-Oriented Prog.";
				
				result[2][1][0] = "Pass";
				result[2][1][1] = "Pass";
				result[2][1][2] = "Pass";
				result[2][1][3] = "Fail";
				result[2][1][4] = "Pass";
				result[2][1][5] = "Pass";
				
				result[2][2][0] = "88";
				result[2][2][1] = "81";
				result[2][2][2] = "76";
				result[2][2][3] = "32";
				result[2][2][4] = "85";
				result[2][2][5] = "78";

		// Semester 4
				
				result[3][0][0] = "Algorithms";
				result[3][0][1] = "Computer Networks";
				result[3][0][2] = "resultbase Systems";
				result[3][0][3] = "Microprocessors";
				result[3][0][4] = "Communication Eng.";
				result[3][0][5] = "Software Engineering";
				
				result[3][1][0] = "Pass";
				result[3][1][1] = "Pass";
				result[3][1][2] = "Fail";
				result[3][1][3] = "Pass";
				result[3][1][4] = "Pass";
				result[3][1][5] = "Pass";
				
				result[3][2][0] = "91";
				result[3][2][1] = "73";
				result[3][2][2] = "19";
				result[3][2][3] = "80";
				result[3][2][4] = "76";
				result[3][2][5] = "87";

		// Semester 5
				result[4][0][0] = "Probability & Stats";
				result[4][0][1] = "Machine Learning";
				result[4][0][2] = "Compiler Design";
				result[4][0][3] = "Theory of Computation";
				result[4][0][4] = "Embedded Systems";
				result[4][0][5] = "Computer Graphics";
				
				result[4][1][0] = "Pass";
				result[4][1][1] = "Pass";
				result[4][1][2] = "Pass";
				result[4][1][3] = "Pass";
				result[4][1][4] = "Pass";
				result[4][1][5] = "Pass";
				
				result[4][2][0] = "86";
				result[4][2][1] = "88";
				result[4][2][2] = "84";
				result[4][2][3] = "95";
				result[4][2][4] = "73";
				result[4][2][5] = "90";
				
				//Print Semester 2 Subject 4 and Subject 5 names. 
				
				System.out.println("Semester 2 Subject 4 name:"+ result[1][0][3]);
				System.out.println("Semester 2 Subject 5 name:"+ result[1][0][4] );
				
				
				//Print the Status/Marks of Semester 4 Subject 3 and Subject 6. 
				System.out.println("Status/Marks of Semester 4 Subject 3 :"+ result[3][1][2]);
				System.out.println("Status/Marks of Semester 4 Subject 6 :"+ result[3][2][5]);
	}

}
