import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GettingUserInputWithMethods {

	public GettingUserInputWithMethods() {
		
		String name= "";
		String age = "";
		String tel = "";
		do{
			System.out.println("Please enter your name:");
			name = getUserInput();
		}while(validateInput(name) == false);
		
		do{
			System.out.println("Please enter your age:");
			age = getUserInput();
		}while(validateInput(age) == false);
		
		do{
			System.out.println("Please enter your tel:");
			tel = getUserInput();
		}while(validateInput(tel) == false);
		
		System.out.println("------------------------------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Tel: " + tel);
		System.out.println("------------------------------");

	}
	
	public String getUserInput() {
		String input = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
		}catch(Exception e) {}
		
		return input;	
	}
	
	public boolean validateInput(String input){
		boolean validated = false;
		if(input.equals("")){
			System.out.println("Wrong input, try again!");
			validated = false;
		}else {
			validated = true;
		}	
		return validated;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GettingUserInputWithMethods();
	}

}
