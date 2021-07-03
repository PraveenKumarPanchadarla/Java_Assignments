import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				System.out.println("Enter the Number : ");
		int t=s.nextInt();
		for(int i=1;i<=t;i++){
					System.out.println("Enter the Factorial Number :");
			int a=s.nextInt();
					System.out.println("Factorial of "+a+" is : ");
			fact(a);
		}
	}
	static int fact(int n){
		int f=1;
		while(n-1>0){
			f*=n;
			n--;
		}
		System.out.println(f);
		return f;
	}			
}
/*-----------------------------------------
Output : 
Enter the Number :
4
Enter the Factorial Number :
3
Factorial of 3 is :
6
Enter the Factorial Number :
7
Factorial of 7 is :
5040
Enter the Factorial Number :
6
Factorial of 6 is :
720
Enter the Factorial Number :
5
Factorial of 5 is :
120*/