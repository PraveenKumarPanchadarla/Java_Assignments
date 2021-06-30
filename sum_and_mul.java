import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a =s.nextInt();
		int mul=1,sum=0,n=a,e;
			while(n>0){
				e=n%10;
				mul*=e;
				sum+=e;
				n=n/10;
			}
			int res=mul-sum;
			System.out.println("The Solution is : "+res);		
	}
}
/*----------------------------------
Output :
Enter the Number :
456
The Solution is : 105*/