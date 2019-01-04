//A shop will give discount of 10% if the cost of purchased quantity is more than 1000. Ask user for quantity
//Suppose, one unit will cost 100. Judge and print total cost for user.

import java.util.*;
class DiscountPrize
{
	public static void main(String args[])
	{
		int quantity,unit,price;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Quantity:");
		quantity=input.nextInt();
		price=100*quantity;
		System.out.println("price is :" +price);
		if(quantity>=10)
		{
			int discount=(price*10)/100;
			price=price-discount;
			System.out.println("Final prize After discount " +price);
		}
		else
		{
			System.out.println("Final Prize is :" +price);
		}
	}
}