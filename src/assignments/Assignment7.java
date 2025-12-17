package assignments;

public class Assignment7 {

	public static void main(String[] args) {
	/*
	 * Assignment-7 (Conditional Statements)

A bank evaluates loan applicants based on the following criteria:
1. Credit Score:
o If the credit score is above 750, the loan is automatically approved.
o If the credit score is between 650 and 750, additional checks are performed.
o If the credit score is below 650, the loan is denied.
2. Income:
o For credit scores between 650 and 750, the customer’s income must be at least $50,000
for the loan to be considered.

3. Employment Status:
o If the customer’s income is at least 50,000, the system checks whether the customer is
employed.
o If the customer is unemployed, the loan is denied.
4. Debt-to-Income Ratio:
o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
o If the DTI ratio is less than 40%, the loan is approved.
o If the DTI ratio is 40% or greater, the loan is denied.

Now based on below details, print whether user is eligible to get the loan or not
customerName = "John Doe";
creditScore = 720;
income = 55000.0;
isEmployed = true;
debtToIncomeRatio = 35.0;
	 */
		String [] employeeName=new String[3];
		int [] creditScore=new int[3];
		int [] income=new int[3];
		Boolean[] isEmployed={true,true,false};
		int [] debtToIncomeRatio=new int [3];
		employeeName[0]="John Doe";
		employeeName[1]="Bharath";
		employeeName[2]="Prabhu";
		creditScore[0]=720;
		creditScore[1]=760;
		creditScore[2]=640;	
		income[0]=55000;
		income[1]=60000;
		income[2]=45000;	
		debtToIncomeRatio[0]=35;
		debtToIncomeRatio[1]=40;
		debtToIncomeRatio[2]=50;
		
		//Find Loan eligible status for CustomerName = "John Doe"
		int empIndex=0;
		
		if (creditScore[empIndex]>=750)
		{
			System.out.println("Credit Score is greater than 750. Hence, the loan is automatically approved.");
		}
		else if ((creditScore[empIndex])<750 && (creditScore[empIndex]>=650))
		{
			if(income[empIndex]>=50000)
			{
				if(isEmployed[empIndex]=true)
				{
					if(debtToIncomeRatio[empIndex]<40)
					{
						System.out.println("Debit to Income Ratio is less than 40. Hence, the loan is automatically approved.");
					}
					else
					{
						System.out.println("Debit to Income Ratio is greater than or equal to 40. Hence,the loan is denied.");	
					}
				}
				else
				{
					System.out.println("Not Employed. Hence, the loan is denied.");	
				}
				
			}
		}
		else if (creditScore[empIndex]<650)
		{
			System.out.println("Credit Score is less than 650. Hence,the loan is denied.");
		}
		
		
		}
	
		
	
	

	}

