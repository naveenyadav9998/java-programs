import java.util.*;
class TablePrint
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number You Want to Print Table: ");
		int num=input.nextInt();

		for(int i=1;i<=10;i++)
		{
			int table=i*num;
			System.out.println(num+" * "+i+" = "+table);
		}
	}
}