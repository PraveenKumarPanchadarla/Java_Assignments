import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number to check Harshad or Not");
		int a =s.nextInt();
		int n=a,sum=0,e;
		while(a>0){
			e=a%10;
			sum+=e;
			a=a/10;
		}
		String res=(n%sum==0)?"A":"Not";
		System.out.println(n+" is "+res+" Harshad Number");	
	}
}
/*------------------------------
Output: 
Enter the Number to check Harshad or Not : 
133
133 is A Harshad Number*/