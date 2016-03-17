package lab2;
import java.util.Scanner;
public class AddNumbers {
	static Scanner input =new Scanner(System.in);
	public static void main(String[] args) {
		int number1 = (int)(Math.random()*100+10);
		int number2=  (int)(Math.random()*100+10);
				
	System.out.print(" What is " + number1+ "+" +number2 + "= ?  ");	
long startTime =System.currentTimeMillis();
int totalNum= input.nextInt();
int correctAnswer= number1 +number2;
long endTime= System.currentTimeMillis();

long totalTime = (long)(endTime-startTime+500)/1000;
System.out.println("The correct answer is:" +correctAnswer+ "    and it took you: " + totalTime+  " seconds");
 number1 = (int)(Math.random()*200+50);
 number2=  (int)(Math.random()*200+50);
			
System.out.print(" What is " + number1+ "+" +number2 + "= ?  ");	
startTime =System.currentTimeMillis();
totalNum= input.nextInt();
correctAnswer= number1 +number2;
endTime= System.currentTimeMillis();

totalTime = (long)(endTime-startTime+500)/1000;
System.out.print("The correct answer is:" +correctAnswer+ "    and it took you: " + totalTime+ " seconds");
	}

}
