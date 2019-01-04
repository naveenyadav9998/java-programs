// 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
//INPUT : 1234        OUTPUT : 4321
//INPUT : 5982        OUTPUT : 2895

import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 4 digit number: ");
		int num=input.nextInt();

		int first_digit=num%10;
		System.out.println(first_digit);

		int second_digit=(num/10)%10;
		System.out.println(second_digit);

		int third_digit=(num/100)%10;
		System.out.println(third_digit);

		int fourth_digit=(num/1000)%10;
		System.out.println(fourth_digit);

		int new_digit=(first_digit*1000)+(second_digit*100)+(third_digit*10)+(fourth_digit*1);
		System.out.println("Reverse digit is: "+new_digit);
	}
}