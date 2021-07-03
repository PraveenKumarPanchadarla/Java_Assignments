import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a=s.nextInt();
		int res=(a%4==0)?++a:--a;
		System.out.println("The Result is : "+res);
	}
}
/*-----------------------------------------
Output : 
Enter the Number :
64
The Result is : 65