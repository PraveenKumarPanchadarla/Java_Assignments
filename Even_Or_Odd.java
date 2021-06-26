import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number To Check Whether it's Even or Odd : ");
		int n=s.nextInt();
		if((n&1)!=0)
		{
			System.out.println(n+" is Odd Number");
		}
		else
		{
			System.out.println(n+ " is Even Number");
		}
	}
}