package assignments;

//import java.util.ArrayList;

public class Assignment8 {

	public static void main(String[] args) {
	/*
	 * Assignment -8 (Conditional Statements & Loops) 
 
Bank Transactions 
Positive value refers Credit and Negative refers Debit Transaction 
Transactions 	Amount 
1 				50000 
2 				-2000 
3 				3000 
4 				-15000 
5 				-200 
6 				-300 
7 				4000 
8 				-3000 
  
First Store all the transactions in any data structure of Your Choice from collections, and by using 
Loops and conditional statements  
1. Print total number of credit and debit transactions completed 
2. Print the total amount credited and debited in account  
3. Print total amount remaining at the end in Bank Account 
4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit 
Transaction with Amount” and also print total number of suspicious transactions 
	 */		
		
		/* Method1: Using Collection
		ArrayList<Integer> bankTransactions = new ArrayList<Integer>();
		bankTransactions.add(50000);
		bankTransactions.add(-2000);
		bankTransactions.add(3000);
		bankTransactions.add(-15000);
		bankTransactions.add(-200);
		bankTransactions.add(-300);
		bankTransactions.add(4000);
		bankTransactions.add(-3000);
		
		
		int creditCount=0;
		int creditAmount=0;
		int debitCount=0;
		int debitAmount=0;
		for(int i=0; i<bankTransactions.size();i++)
		{
			if((bankTransactions.get(i)>0) && (bankTransactions.get(i)<=9999) )
					{
						creditCount++;
						creditAmount=creditAmount+bankTransactions.get(i);
					}
			else if((bankTransactions.get(i)>=10000))
					{
						creditCount++;
						creditAmount=creditAmount+bankTransactions.get(i);
						System.out.println("Transaction limit exceeds. Suspicious credit amount: "+bankTransactions.get(i));
					}
			else if((bankTransactions.get(i)<0))
					{
						debitCount++;
						debitAmount=debitAmount+bankTransactions.get(i);
						System.out.println("Transaction limit exceeds, Suspicious debit amount: "+bankTransactions.get(i));
					}
		}
		
		System.out.println("Total number of credit transactions completed:"+creditCount);
		System.out.println("Total number of debit transactions completed:"+debitCount);
		System.out.println("Total amount credited in account: "+creditAmount);
		System.out.println("Total amount debited in account: "+debitAmount);
		System.out.println("Total amount remaining at the end in Bank Account: "+(creditAmount+debitAmount));
		
		*/
		/* Method2: Array*/
		
		int [] transactions = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000};
		int crAmount=0, drAmount=0, crCount=0, drCount=0;
		for (int amount: transactions)
		{
			if(amount>0)
			{
				crCount=crCount+1;
				if(amount>10000)
				{
					System.out.println("Transaction limit exceeds. Suspicious credit amount: "+amount);
				}
				crAmount+=amount;
			}
			else if(amount<0)
			{
				
					drCount=drCount+1;
					if(amount<-9999)
					{
						System.out.println("Transaction limit exceeds, Suspicious debit amount: "+amount);
					}
					drAmount+=amount;
			}
		}
		System.out.println("Total number of credit transactions completed:"+crCount);
		System.out.println("Total number of debit transactions completed:"+drCount);
		System.out.println("Total amount credited in account: "+crAmount);
		System.out.println("Total amount debited in account: "+drAmount);
		System.out.println("Total amount remaining at the end in Bank Account: "+(crAmount+drAmount));	
				
			}
			
		}