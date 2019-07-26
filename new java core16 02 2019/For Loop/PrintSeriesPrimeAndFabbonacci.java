import java.util.*;

class PrintSeriesPrimeAndFabbonacci
{
	public static void main(String args[])
	{
		Scanner input=new Scanner (System.in);
		System.out.println("Enter Nth Term");
		int n=input.nextInt();

		int arr[]=new int[n];

		int a=0,b=1,c=1;for(int i=0;i<arr.length;i=(i+2))
		{
			a=b;
			b=c;
			c=a+b;
			arr[i]=a;
		}

		int status;

		for(int i=1;i<arr.length;i=(i+2))
		{
			for(int k=1;k<arr.length;k++)
			{
				status=0;
				for(int j=1;j<arr.length;j++)
				{
					if(k%j==0)
					{
						status++;

					}

				if(status==2)
				{
					arr[i]=i;
				}
			}
			}
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
