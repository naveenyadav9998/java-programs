import java.util.*;
class WorksArea
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=input.nextLine();

		System.out.println("Enter Sex: ");
		String sex=input.next();
		int temp=sex.charAt(0);

		System.out.println("Enter Age: ");
		int age=input.nextInt();

		if(temp==102 ||temp==70)
		{
			System.out.println("Name: "+name+"\nAge: "+age+"\nplaced in urban");
		}
		else if(age>40 && age<=60)
		{
			System.out.println("Name: "+name+"\nAge: "+age+"\nplaced in urban");
		}
		else if(age>=20 && age<=40)
		{
			System.out.println("Name: "+name+"\nAge: "+age+"\nplaced in Anywhere");
		}


	}
}