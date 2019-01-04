import java.util.*;
class ExArray2
{
    public static void main(String args[] )
    {

    int arr[][] , size;
    Scanner input=new Scanner(System.in);
     System.out.print("Enter row: ");
     size=input.nextInt();
     arr=new int[size][];
     for(int i=0;i<arr.length;i++)
     {

			 System.out.print("Enter the cols: ");
			 int cols=input.nextInt();
             arr[i]=new int[cols];


			 for(int j=0;j<arr[i].length;j++)
         {
			System.out.println("x["+i+"][ "+j+"]:");
			arr[i][j]=input.nextInt();

		 }
	 }
	 for(int i=0;i<arr.length;i++)
	 		 {
				  for(int j=0;j<arr[i].length;j++)
         {
	 		 System.out.println(arr[i][j]+"");
		 }
		 System.out.println();


	      }


    }
}