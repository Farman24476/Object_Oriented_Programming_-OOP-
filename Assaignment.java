class ameen{
public static void main(String args[])
{
int a, b, c;
a = b = c = 100; // set a, b, and c to 100
System.out.println("a = " + (a+=b)); //a=a+b
System.out.println("b = " + (b-=a)); //b=b-a
System.out.println("c = " + c);
}
}