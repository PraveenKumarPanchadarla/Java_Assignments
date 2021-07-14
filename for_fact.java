import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int a =s.nextInt();
		int fact=1;
		for(int i=a;i>=1;i--)
			fact*=i;
		System.out.print("The Factorial Of The Given Number ( " +a+ " ) is : " +fact);
	}
}
/*-----------------------------------------
Output :
Enter A Number : 5
The Factorial Of The Given Number ( 5 ) is : 120
*/