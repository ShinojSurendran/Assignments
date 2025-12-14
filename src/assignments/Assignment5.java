package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {
		/*
		 * Assignment (Arrays & Collections)
		1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		 */
		
		//1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		List<String> nameCities	= new ArrayList<String>();
		List<Double> areaCities = new ArrayList<Double>();
		
		nameCities.add("Sermersooq");
		nameCities.add("Avannaata");
		nameCities.add("Nagqu");
		nameCities.add("Eeyou Istchee Baie-James");
		nameCities.add("Hulunbuir");
		
		areaCities.add(575300.00);
		areaCities.add(522700.00);
		areaCities.add(353010.00);
		areaCities.add(283123.42);
		areaCities.add(234545.00);
		System.out.println("Total area of the 3rd and 4th cities combined: "+(areaCities.get(2)+areaCities.get(3))+" square km");
		System.out.println("********************************************************");
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		Set<String> touristPlace=new HashSet<String>();
		touristPlace.add("Forbidden City");
		touristPlace.add("Great Mosque of Mecca");
		touristPlace.add("Giza Necropolis");
		touristPlace.add("Colosseum");
		touristPlace.add("Notre-Dame de Paris");
		touristPlace.add("St. Peter’s Basilica");
		touristPlace.add("Palace of Versailles");
		touristPlace.add("Eiffel Tower");
		touristPlace.add("Sistine Chapel");
		touristPlace.add("Taj Mahal");
		System.out.println("top 10 most visited tourist attractions in the world");
		System.out.println(touristPlace);
		System.out.println("Size: "+touristPlace.size());
		System.out.println("********************************************************");
		
		//3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		int [] num = new int[10];
		num[0]=10;
		num[1]=20;
		num[2]=10;
		num[3]=30;
		num[4]=5;
		num[5]=70;
		num[6]=8;
		num[7]=2;
		num[8]=4;
		num[9]=11;
		System.out.println("Average of 5th and 6th Value: "+(num[4]+num[5])/2);
		System.out.println("********************************************************");
		
		//4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		List<String> nameMovie=new ArrayList<String>();
		nameMovie.add("Avatar");
		nameMovie.add("Avengers: Endgame");
		nameMovie.add("Avatar: The Way of Water");
		nameMovie.add("Titanic");
		nameMovie.add("Ne Zha 2");
		System.out.println("Third movie on the list  "+nameMovie.get(2));
	}

}
