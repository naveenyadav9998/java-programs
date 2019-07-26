import java.util.*;
 class CheckConsonantAurVowel
 {
	 public static void main(String args[])
	 {
		Scanner input=new Scanner(System.in);

		System.out.println("Enter Character To check Wheter Number is vowel aur Consonant: ");
		String s1=input.next();

		if(s1.equalsIgnoreCase("a") || s1.equalsIgnoreCase("e") || s1.equalsIgnoreCase("i") || s1.equalsIgnoreCase("o") || s1.equalsIgnoreCase("u"))
		{
			System.out.println("It's a vowel");
		}
		else
		{
			System.out.println("It's a Consonant");
		}
	 }
 }