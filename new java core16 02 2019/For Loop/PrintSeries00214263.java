import java.util.*;
class PrintSeries00214263
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter nth term");
		int size=input.nextInt();
		int num[]=new int [size];

		int first=0, temp=0;
		for(int i=0;i<num.length;i=i+2)
		{
			 num[i]=first;
			first=first+2;


		}
		for(int i=1;i<num.length;i=i+2)
		{
			 num[i]=temp;
			 temp=temp+1;

		}
		System.out.print("Series is: ");
		for(int i=0;i<num.length;i++)
		{

			System.out.print(num[i]+" ");
		}

	}
}