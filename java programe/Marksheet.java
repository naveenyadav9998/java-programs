import java.util.*;
class Marksheet 
{
	public static void main(String args[])
	{
		int roll,h,e,ss,s,m,c;
		float p;
		char n;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Roll number:");
		roll=input.nextInt();

		System.out.println("Enter the Marks of Hindi");
		h=input.nextInt();

		System.out.println("Enter the Marks of English");
		e=input.nextInt();

		System.out.println("Enter the Marks of Social Science");
		ss=input.nextInt();

		System.out.println("Enter the Marks of Science");
		s=input.nextInt();

		System.out.println("Enter the Marks of Mathematics");
		m=input.nextInt();

		System.out.println("Enter the Marks of Computers");
		c=input.nextInt();

		p=(h+e+ss+s+m+c)/6;

		System.out.println(roll);
		if(p>=60 && p<=100)
		{
			System.out.println("passed by 1st division");
		}
		else if(p>=45 && p<=59)
		{
			System.out.println("passed by 2nd division");
		}
		else if(p>=33 && p<=44)
		{
			System.out.println("passed by 3rd division");
		}
		else
		{
			System.out.println("failed");
		}
	}
}
