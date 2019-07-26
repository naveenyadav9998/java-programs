import java.util.*;
class FindElementInTwoDArray
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
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

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Enter the element you want to find");

		int find=input.nextInt();

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(find==arr[i][j])
				{
					System.out.println("Element found "+find+" in Postion row: "+(i+1)+" Colomn: "+(j+1));
				}

			}
		}
	}
}
