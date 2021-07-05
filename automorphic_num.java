import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a=s.nextInt();
		int b=a*a;
		String k=String.valueOf(a);
		String s1=String.valueOf(b);
		String p=(s1.endsWith(k))?"An":"Not An";
		System.out.println(a+" is "+p+" Automorphic number");
	}
}
/*-----------------------------------------
Output : 
Enter the Number :
31
31 is Not An Automorphic number*/

	      	