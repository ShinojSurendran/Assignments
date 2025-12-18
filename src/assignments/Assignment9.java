package assignments;

public class Assignment9 {

	public static void main(String[] args) {
		/*
		 * Assignment (Arrays and Loops)
		Given values are 12 ,34,11,36,87,98,93.
		Store the values in Array and Print second and third largest number from the above values without
		using collections and default sort methods
		 */
			
			//t j=1;
			int [] values= {12, 34, 11, 36, 87, 98, 93};
			int [] value1= {};
			int tempValue=values[0];
			for (int i=0; i<values.length;i++)
			{
				if (tempValue>=values[i+1])
				{
					tempValue=values[i+1];
					//tempValue=values[i];
				}
				else
				{
					//tempValue=0;
					tempValue=values[i];
				}
			}
			System.out.println(tempValue);
	}

	}