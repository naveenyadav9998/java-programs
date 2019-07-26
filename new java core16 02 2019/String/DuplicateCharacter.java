import java.util.*;

class DuplicateCharacter
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);

		System.out.println("Enter A String");
		String s1=input.next();


		for(int i=0;i<=s1.length()-1;i++)
		{
			char temp= s1.charAt(i);
			for(int j=i+1;j<=s1.length()-1;j++)
			{
				char temp2= s1.charAt(j);
				if (temp==temp2)
				{
					System.out.println("character is duplicate "+temp);
				}
			}

		}

	}
}