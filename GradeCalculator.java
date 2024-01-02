import java.util.Scanner;
public class GradeCalculator{
	public static void main(Stirng[]args){
	Scanner GradeCalculator=new Scanner(System.in);
	System.out.print("Put the marks");
double marks=GradeCalculator.nextDouble();

String grade=(marks>=50)?"Pass":"Fall";
System.out.println("The grade is:"+grade);
GradeCalculator.close();

}

}