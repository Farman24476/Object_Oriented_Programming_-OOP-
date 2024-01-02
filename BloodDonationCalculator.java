import java.util.Scanner;
public class BloodDonationCalculator{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		
		System.out.print("What is your age:");
		int personAge=input.nextInt();
		
		System.out.print("What is your Weight in kilograms:");
		int personWeight=input.nextInt();
		if (personAge>18&&personWeight>50){
			System.out.println("You're eligible to donate blood");
		}
		else{
			System.out.println("You're not eligibleto donate blood");
		}
	}
}