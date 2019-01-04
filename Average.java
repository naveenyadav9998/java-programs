import java.util.*;
class Average
{
	public static void main (String args[])
	{
		int p,c,m,h,e;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Physics Marks: ");
		p=input.nextInt();

		System.out.print("Enter Chemistry Marks: ");
		c=input.nextInt();

		System.out.print("Enter Mathematics Marks: ");
		m=input.nextInt();

		System.out.print("Enter Hindi Marks: ");
		h=input.nextInt();

		System.out.print("Enter English Marks: ");
		e=input.nextInt();
		float per=(p+c+m+h+e)/5;
		System.out.println("Your Percentage: "+per);
	}
}

