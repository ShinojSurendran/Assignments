package assignments;

public class Assignment6 {

	public static void main(String[] args) {
	/*
	Assignment -6 (Arrays/Datatypes/Operators)
	1. Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and marks [75, 80, 82] Add 10 marks to each students using assignment operators and
	store it into another array, after adding 10 marks identify the average marks of all
	 */
		String []studentName= {"Suresh", "Mahesh", "Naresh"};
		int [] marks= {75, 80, 72};
		System.out.println("Old Marks");
		System.out.println(studentName[0]+": "+marks[0]);
		System.out.println(studentName[1]+": "+marks[1]);
		System.out.println(studentName[2]+": "+marks[2]);
		//Add 10 marks to each students using assignment operators and store it into another array
		int [] newMarks= {marks[0]+10, marks[1]+10, marks[2]+10,};
		System.out.println("New Marks");
		System.out.println(studentName[0]+": "+newMarks[0]);
		System.out.println(studentName[1]+": "+newMarks[1]);
		System.out.println(studentName[2]+": "+newMarks[2]);
		System.out.println("Average marks of all Marks: "+((newMarks[0]+newMarks[1]+newMarks[2])/3));
	}

}
