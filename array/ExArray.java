import java.util.*;
class ExArray
{
	public static void main(String args[])
	{
		int arr[];
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size=input.nextInt();
		arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Element: ");
			arr[i]=input.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}