import java.util.*;
class Factorial 
{
	public static void main(String[] args) 
	{
		int i,fact=1,n;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number you want to factorial");
		n=input.nextInt();
		for(i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is: " +fact);

	}
}
