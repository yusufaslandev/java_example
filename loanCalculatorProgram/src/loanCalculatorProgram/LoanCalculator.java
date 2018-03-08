package loanCalculatorProgram;
import java.util.Scanner;
public final class LoanCalculator {

	public static void main(String[] args) {
        double monthly_payment;
        double total_payment;
		Scanner scanner = new Scanner(System.in);
		loan loanobject=new loan();
		System.out.println("Enter loan amount: ");
		loanobject.setAmount(scanner.nextDouble());
		System.out.println("Enter loan period: ");
		loanobject.setPeriod(scanner.nextDouble());
		System.out.println("Enter loan interestRate: ");
		loanobject.setRate(scanner.nextDouble());
		monthly_payment=CalculatePayment(loanobject.getAmount(),loanobject.getPeriod(),loanobject.getRate());
		total_payment=monthly_payment*loanobject.getPeriod()*12;
	    System.out.println("amount:" + loanobject.getAmount());
	    System.out.println("period:" + loanobject.getPeriod());
	    System.out.println("rate:" + loanobject.getRate());
	    System.out.println("monthly payment:" + monthly_payment);
	    System.out.println("total payment:" +total_payment);
		

	}
	public static double CalculatePayment(  double loanAmount,double period , double interestrate)
	{
		    double monthlyrate;
	        double months,monthlypayment;
	        interestrate /=100;
	        monthlyrate=interestrate /12;
	        months=period *12;
	        monthlypayment=(loanAmount*monthlyrate) / (1-Math.pow(1+monthlyrate, -months));	
	        return monthlypayment;
	    	
			
		
	}


}
