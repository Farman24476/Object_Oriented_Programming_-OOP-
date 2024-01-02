public class bitwiseop {
public static void main(String[] args) {
//Variables Definition and Initialization
int num1 = 30, num2 = 6, num3 =0;
//Bitwise AND, O/P num1 & num2 = 6
System.out.println("num1 & num2 = " + (num1 & num2));
//Bitwise OR, O/P num1 | num2 = 30
System.out.println("num1 | num2 = " + (num1 | num2) );
//Bitwise XOR, O/P num1 ^ num2 = 24
System.out.println("num1 ^ num2 = " + (num1 ^ num2) );
43
//Binary Complement Operator, O/P ~num1 = -31
System.out.println("~num1 = " + ~num1 );
//Binary Left Shift Operator O/P num1 << 1 = 120
num3 = num1 << 2;
System.out.println("num1 << 1 = " + num3 );
//Binary Right Shift Operator O/P num1 >> 1 = 7
num3 = num1 >> 2;
System.out.println("num1 >> 1 = " + num3 );
//Shift right zero fill operator, O/P num1 >>> 1 = 7
num3 = num1 >>> 2;
System.out.println("num1 >>> 1 = " + num3 ); } }