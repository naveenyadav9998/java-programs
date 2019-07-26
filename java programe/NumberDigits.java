import java.util.*; 
public class NumberDigits 
{ 
  public static void main(String[] args) 
             { 
                  int count = 0, num; 
                  Scanner s=new Scanner(System.in); 
                  System.out.println("Enter A Number"); 
                  num =s.nextInt(); 
				   while(num != 0)
        {
           
            num= num/10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
            
}
