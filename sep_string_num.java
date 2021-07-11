import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String even="",odd="";
		String x=s.next();
		for(int i=0;i<x.length();i++){
			int b=x.charAt(i);
			if (b%2==0)
				even+=x.charAt(i);
			else
				odd+=x.charAt(i);
		}
		System.out.println("The Result After Even & Odd Seperation : "+odd+" "+even);
			
	}
}
/*-----------------------------------------
Output : 
Enter the Number :
123456789
The Result After Even & Odd Seperation : 13579 2468 */