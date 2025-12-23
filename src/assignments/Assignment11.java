package assignments;

import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args) {
	/* Assignment11
	 * Prime Number
	 */
		int num;
		int count=0;
		System.out.println("Enter a Number: ");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		for(int i=2; i<num-1;i++)
		{
			if (num<=1)
			{
				System.out.println(num+" is not a Prime Number");
				break;
			}
			else
			{
				if (num%i==0 && num>i)
				{
					count=count+1;
				}
			}
		 }
		if(count==0)
		{
			System.out.println(num+" is a Prime Number");
		}
		else if (count>=1)
		{
			System.out.println(num+" is not a Prime Number");
		}

	}

}
