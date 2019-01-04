import java.util.*;
class Table
{
	public static void main(String args[])
	{
		int i,n,table=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter table you want to print: ");
		n=input.nextInt();
		for(i=1;i<=10;i++)
		{
			table=n*i;

			System.out.println(n+"  "+i +"  "+table);

		}
	}
}