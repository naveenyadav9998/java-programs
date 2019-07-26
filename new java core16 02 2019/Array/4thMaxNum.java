import java.util.*;

class 4thMaxNum
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Size of array: ");
		int size=input.nextInt();
		int arr[]= new int[size];

		System.out.println("Enter the elements in Array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=input.nextInt();
		}
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				int temp=max;
				max=arr[i];
				arr[i]=temp;
			}
			System.out.print(arr[i]);
		}


	}
}