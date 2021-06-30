import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String a=s.next();
		System.out.println("Enter the Digit That you want to replace : ");
		String b=s.next();
		System.out.println("Enter the new digit to get replaced : ");
		String c=s.next();
		for(int i=0;i<a.length();i++)
		{
        a=a.replace(b,c);
			}
		System.out.print("After replacing "+b+" with "+c+" : "+a);
	}
}
/*----------------------------------
Output: 
Enter the Number :
123456
Enter the Digit That you want to replace :
5
Enter the new digit to get replaced :
9
After replacing 5 with 9 : 123496