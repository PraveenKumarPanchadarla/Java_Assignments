import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String x=s.next();
		int l=x.length();
		String y="";
		for(int i=l-1;i>=0;i--){
			y+=x.charAt(i);
		}
		String res=(x.equals(y))?"A":"Not A";
		System.out.println(y+" is "+res+ " Palindrome String");
	}
}
/*-----------------------------------------
Output : 
Enter the String : madam
madam is A Palindrome String */