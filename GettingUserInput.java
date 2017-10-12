import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GettingUserInput {

	public GettingUserInput() {
		String name = "";
		String age = "";
		String tel = "";

		System.out.println("Please enter your name:");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			boolean gotCorrectInput = false;
			do {
				name = br.readLine();
				if(name.equals("")) {
					System.out.println("Sorry you didn't enter your age, try again");
					gotCorrectInput = false;
				}else {
					gotCorrectInput = true;
				}
			}while(gotCorrectInput == false);   
		}catch(Exception e ) {}

		System.out.println("Please enter your age:");

		try {
			boolean gotCorrectInput = false;
			do {
				age = br.readLine();
				if(age.equals("")) {
					System.out.println("Sorry you didn't enter your age, try again");
					gotCorrectInput = false;
				}
				else {
					gotCorrectInput = true;
				}	
			}while(gotCorrectInput == false);   
		}catch(Exception e ) {}
		
		System.out.println("Please enter your tel:");

		try {
			boolean gotCorrectInput = false;
			do {
				tel = br.readLine();
				if(tel.equals("")) {
					System.out.println("Sorry you didn't enter your age, try again");
					gotCorrectInput = false;
				}
				else {
					gotCorrectInput = true;
				}	
			}while(gotCorrectInput == false);   
		}catch(Exception e ) {}

		System.out.println("------------------------------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Age: " + tel);
		System.out.println("------------------------------");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GettingUserInput();
	}

}
