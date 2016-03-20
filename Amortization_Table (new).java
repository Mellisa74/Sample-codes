import java.util.Scanner;
public class Amortization_Table {

	public static void main(String[] args) {
		double monthlyPayment=0;
		Scanner input=new Scanner(System.in);


		System.out.print("Please enter value for interest rate:  ");
		double irate= input.nextDouble();
		System.out.print("Please enter number of years for loan:  ");
		int numYears=input.nextInt();
		System.out.print("Please enter the loan amount:  ");
		double loan=input.nextDouble();
		double monthlyIntRate=(irate/12)/100;//monthly interest rate
		double numPayments= numYears*12;//#of payments
		double principal=loan;//Principal
		monthlyPayment= principal* monthlyIntRate/(1-1/Math.pow(1+ monthlyIntRate, numYears*12));
		double totalPayment=monthlyPayment*numPayments;
		double balance=0;
		System.out.print("Monthly payment  $ ");
		System.out.printf("%7.2f\n",  monthlyPayment);
		System.out.printf("%9s      %9s     %9s     %9s\n", "payment", "interest", "principal", "balance");

		for (int k=0;k<=loan;k++){
			//outer loop controls rows
			for(int i=1;i<=numPayments;i++){
				//inner loop controls columns
				double interest = monthlyIntRate * loan;
				principal = monthlyPayment - interest;
				loan = loan - principal;

				System.out.printf("%9d      %9.2f     %9.2f     %9.2f\n",i, interest, principal, loan); 		
			}

		}
	}
}
