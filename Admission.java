import java.util.Scanner;
public class Admission{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter your high School grade point Average:");
		double GPA=input.nextDouble();
		
		System.out.print("Enter your Admisssion test Score:");
		int testScore=input.nextInt();
		if ((GPA>=3.0&& testScore>=60)||(GPA<3.0&&testScore>=80)){
			System.out.println("Accept");
		}
		else{
			System.out.println("Reject");
		}
	}
}