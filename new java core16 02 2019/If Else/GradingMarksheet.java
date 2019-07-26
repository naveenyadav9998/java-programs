import java.util.*;
class GradingMarksheet
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Mathematics marks: ");
		int math=input.nextInt();

		System.out.println("Enter Physics marks: ");
		int physics=input.nextInt();

		System.out.println("Enter Chemestry marks: ");
		int chemestry=input.nextInt();

		System.out.println("Enter Hindi marks: ");
		int hindi=input.nextInt();

		System.out.println("Enter English marks: ");
		int english=input.nextInt();

		int grade=(math+physics+chemestry+hindi+english)/5;

		if(grade>=80)
		System.out.println("You Got A grade");

		else if(grade>=60 && grade<80)
		System.out.println("You Got B grade");

		else if(grade>=50 && grade<60)
		System.out.println("You Got C grade");

		else if(grade>=45 && grade<50)
		System.out.println("You Got D grade");

		else if(grade>=25 && grade<45)
		System.out.println("You Got E grade");

		else
		System.out.println("You Got F grade");

	}
}