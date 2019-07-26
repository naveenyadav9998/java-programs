import java.util.*;

class AddOneDArray
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Size of array: ");
		int size=input.nextInt();
		int arr[]=new int [size];

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Eneter the Element ");
			arr[i]=input.nextInt();
		}
		int add=0;
		for(int i=0;i<arr.length;i++)
		{
			add=add+arr[i];
		}
		System.out.println("Total of array element is: "+add);
	}
}
