class ExArrayBasic
{
	public static void main (String args[])
	{
		int arr[]=new int[5]; //just like int a= 5
		arr[0]=10;//initialization
		arr[1]=20;
		arr[2]=70;
		arr[3]=40;
        arr[4]=50;
        for(int i=0;i<arr.length;i++)
        {
			System.out.println("Array elements are: "+arr[i]);
		}
	}
}