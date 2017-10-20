import java.io.BufferedReader;
import java.io.InputStreamReader;

public class loanCalculator {
	
	
	public loanCalculator(){
	
	System.out.println("How much?");
	double amount = Double.parseDouble(getUserInput());
	System.out.println("What's the interest rate?");
	double interestRate = Double.parseDouble(getUserInput());
	System.out.println("For how long?");
	double years = Double.parseDouble(getUserInput());
	
	Calculator(years, interestRate, amount);
	
	}
	
	public void Calculator(double years, double interestRate, double amount){

		double interest = 	(amount* Math.pow(1+(interestRate/100), years))-amount;		
		System.out.println((double)Math.round(interest*100)/100);
	}
	
	public String getUserInput() {
		
		String input = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
		}catch(Exception e) {}
		
		return input;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new loanCalculator();
	}

}
