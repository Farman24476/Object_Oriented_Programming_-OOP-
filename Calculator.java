public class GradeCalculator{
	public static void main(Stirng[]args){
	Scanner farman=new Scanner(System.in);
	System.out.print("Put the marks");
double marks=farman.nextDouble();

String grade=(marks>=50)?"Pass":"Fall";
System.out.println("The grade is:"+grade);
farman.close();}






}