import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number To Get Reversed : ");
		int a=s.nextInt();
		System.out.println("The Reversed Number is : ");
		reverse(a);
	}
		static int reverse(int n){			
			int rem=0,rev=0;
			int b=(n<0)?-n:n;
			while(b>0){
				rem=b%10;
				rev=rev*10+rem;
				b=b/10;
			}
			n=(n<0)?-rev:rev;
			System.out.println(n);
			return n;
		}
		
}
/*-------------------------------------
Output :
Enter the Number To Get Reversed : -456
The Reversed Number is : -654
