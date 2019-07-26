import java.util.*;

class AddTwoDArray
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the row");
		int row =input.nextInt();
		System.out.println("Enter the colomn");
		int colomn=input.nextInt();

		int arr[][]=new int [row][colomn];

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the element: ");
				arr[i][j]=input.nextInt();
			}
		}
		int add=0;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				add=add+arr[i][j];
				System.out.println(arr[i][j]);

			}
		}
		System.out.println("Total of 2 d Array is: "+add);
	}
}