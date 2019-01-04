import java.util.*;
class Hello
{
	public static void main(String args[])
	{
		String fname,lname;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Your First Name: ");
		fname=input.next();
		System.out.print("Enter Your Last Name: ");
		lname=input.next();
		System.out.println("Hello " +fname+" "+lname);
	}
}