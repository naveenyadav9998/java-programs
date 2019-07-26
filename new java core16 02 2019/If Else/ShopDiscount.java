
import java.util.*;
class ShopDiscount
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the Quantity: ");
		int quantity=input.nextInt();

		int cost=quantity*100;

		if(cost>=1000)
		{
			int discount=(cost*10)/100;
			int total=cost-discount;
		    System.out.println("Your cost is: "+cost+ "\nYou got 10% discount: "+discount+"\nSo total cost is: "+total);
		}

		else
		{
			System.out.println("You got no discount So total cost is "+cost);
		}

	}
}
