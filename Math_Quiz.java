
import java.util.Scanner;
public class Math_Quiz {

	static long startTime;
	static long endTime;
	static Scanner input= new Scanner(System.in);
	static final int NUM_OF_QUESTIONS=10;
	
	public static void main(String[] args) {
		int numcorrect=0;
		
		for (int k=0;k<5;k++)
		{	 
			boolean result;

			int val1=randomNum(20,5);
			
			int val2=randomNum(20,5);
			
			result=additionProb(val1,val2);
			if (result)
				numcorrect++;
			
				
			val1=randomNum(20,5);

			val2=randomNum(20,5);
			
			result=subtractionProb(val1,val2);
			
			if (result)
				numcorrect++;
		
		}
		{
		char grade;
		int totalnumber=NUM_OF_QUESTIONS;
		System.out.println("You have  " + numcorrect +"  out of  " + NUM_OF_QUESTIONS );	
	    grade=letterGrade(numcorrect,totalnumber);	
	    System.out.println(grade);
		long totalTime = (long)(endTime-startTime+500)/1000;
		System.out.println("The average response time:   " +totalTime + "  seconds");
		}
	}

	

	public static int randomNum(int range, int offset) {

		int a  =(int)(Math.random()*range+offset);

		return a;

	}
	
	public static boolean additionProb(int num1, int num2){
		System.out.println("What is  "+ num1 + "  +   " + num2 + "?");
		  startTime =System.currentTimeMillis();
		int answer= input.nextInt();
			if (num1+num2!=answer){
			System.out.print("Incorrect--  ");
			System.out.println("The correct value is  "+ (num1+num2));
			return false;
			}
			
			if (num1+num2==answer)
			System.out.println("Correct!");
			endTime= System.currentTimeMillis();
			return true;		
			
			}	
	
		
	public static boolean subtractionProb(int num1, int num2){
			if (num1 <num2){
			int temp=num1;
			num1=num2;
			num2=temp;
			}
			System.out.println("What is  "+ num1 + "  -  " + num2 + "?");
			startTime =System.currentTimeMillis();
			int answer= input.nextInt();
			
			if (num1-num2!=answer){
				System.out.print("Incorrect-- ");
				System.out.println("The correct value is  " + (num1-num2));
			   return false;
			}
						if (num1-num2==answer)
				System.out.println("Correct!");
				endTime= System.currentTimeMillis();
				return true;
				}
	
	public static char letterGrade(int numcorrect, int totalnumber){
		
		int score=(numcorrect/totalnumber)*100;
		
		if (score>=90)
			return 'A';
		else if (score>=80)
			return 'B';
		else if (score >=70)
			return 'C';
		else if (score >= 60)
			return 'D';
		else
			return 'F';
		
		
		
	}
		
}















