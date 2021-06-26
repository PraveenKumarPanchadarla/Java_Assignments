import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First Value");
		int a=s.nextInt();
		System.out.println("Enter the Second Value");
		int b=s.nextInt();
		System.out.println("Values Before Swapping\n"+"First Value = "+a+"\nSecond Value ="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Values After Swapping\n"+"First Value = "+a+"\nSecond Value ="+b);
		
		
	}
}