import java.util.*;

class FindElement
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
		System.out.println("Enter the element you want to find: ");
		int temp=input.nextInt();
		for (int i=0;i<arr.length;i++)
		{
			if(temp==arr[i])
			{
				System.out.println("Your element is "+temp+" on location "+(i+1));
			}
		}
	}
}