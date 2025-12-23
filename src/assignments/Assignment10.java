package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Assignment10 {

	public static void main(String[] args) {
	/*
	 * Assignment  (Conditional Statements & Loops) 
 
Employee Table 
S.No 	Name 			Base Salary 	Experience (Years) 	Year-End Rating (Out of 5) 
1	 Alice Johnson 		75000.0 		5.1 					4.2 
2	 Bob Smith 			68000.0 		3.2 					3.8 
3 	 Carol Davis 		82000.0 		7.1 					4.5 
4 	 David Brown 		90000.0 		10.2 					2.5 
5 	 Eva Green 			60000.0 		2.4 					3.5 
 
Hike
 Rating  		% of  base Salary as variable pay  		Bonus 
> =4.0 			15.0 									1500 
>=3 && < 4 		10.0 									1200 
< 3.0 			3.0 									300 
 
Extra Perks  
Employees with Experience >= 5 Years get extra Reward of 5000; 
 
There are 5 Employee records. Now Calculate the Hike percentage of each Employee and store the 
Values in Map  with EmployeeName and HikePercentagevalue  and Print them. 
 
Ex: Map<String, Double> output ; 
 
Hike  =  ( Base Salary * variable pay % ) + Bonus + Reward ; 
Hike % =  Hike / Base Salary . 
	 */
List <String> nameList	=new ArrayList<String>();
List <Double> baseSalaryList=new ArrayList<Double>();
List <Double> experienceList=new ArrayList<Double>();
List <Double> yearEndRatingList=new ArrayList<Double>();

	nameList.add("Alice Johnson");
	nameList.add("Bob Smith");
	nameList.add("Carol Davis");
	nameList.add("David Brown");
	nameList.add("Eva Green");
	
	baseSalaryList.add(75000.0);
	baseSalaryList.add(68000.0);
	baseSalaryList.add(82000.0);
	baseSalaryList.add(90000.0);
	baseSalaryList.add(60000.0);
	
	experienceList.add(5.1);
	experienceList.add(3.2);
	experienceList.add(7.1);
	experienceList.add(10.2);
	experienceList.add(2.4);
	
	yearEndRatingList.add(4.2);
	yearEndRatingList.add(3.8);
	yearEndRatingList.add(4.5);
	yearEndRatingList.add(2.5);
	yearEndRatingList.add(3.5);
	
	List<Double> hikeList=new ArrayList<Double>();
	List<Double> hikePercentageList=new ArrayList<Double>();
	

		for (int i=0; i<nameList.size(); i++)
		{
			if (experienceList.get(i)>= 5)
			{
				if(yearEndRatingList.get(i)>=4.0)
				{
					hikeList.add((baseSalaryList.get(i) * 0.15) + 1500 + 5000);
					hikePercentageList.add(hikeList.get(i)/baseSalaryList.get(i));
				}
				else if ((yearEndRatingList.get(i)>=3.0 && yearEndRatingList.get(i)<4.0))
				{
					hikeList.add((baseSalaryList.get(i) * 0.10) + 1200+ 5000);
					hikePercentageList.add(hikeList.get(i)/baseSalaryList.get(i));
				}
				else if(yearEndRatingList.get(i)<3.0)
				{
					hikeList.add((baseSalaryList.get(i) * 0.03) + 300+ 5000);
					hikePercentageList.add(hikeList.get(i)/baseSalaryList.get(i));
				}
				
			}
			else
			{
				if(yearEndRatingList.get(i)>=4.0)
				{
					hikeList.add((baseSalaryList.get(i) * 0.15) + 1500 );
					hikePercentageList.add(hikeList.get(i)/baseSalaryList.get(i));
				}
				else if ((yearEndRatingList.get(i)>=3.0 && yearEndRatingList.get(i)<4.0))
				{
					hikeList.add((baseSalaryList.get(i) * 0.10) + 1200);
					hikePercentageList.add(hikeList.get(i)/baseSalaryList.get(i));
				}
				else if(yearEndRatingList.get(i)<3.0)
				{
					hikeList.add((baseSalaryList.get(i) * 0.03) + 300);
					hikePercentageList.add(hikeList.get(i)/baseSalaryList.get(i));
				}
			}
		}
		
		
		Map<String, Double> output=new HashMap<String, Double>();
		for(int k=0;k<nameList.size();k++)
		{
			output.put(nameList.get(k), hikePercentageList.get(k));
		}
		
		for(String empName : nameList)
		{
			System.out.println(empName+": "+output.get(empName));
		}
		
		
	}

	}

