import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Line Of Strings : ");
		String x=s.nextLine();
		int l=x.length();
		if (l==0)
			System.out.println(0);
		else{
			String y[]=x.split(" ");
			int u=y.length;
			int c=l-(u-1);
			System.out.print("The Total no. of Characters without Spaces : "+c);
		}
	}
}
/*-----------------------------------------
Output : 
Enter the Line Of Strings :
The Name is Sherlock Holmes
The Total no. of Characters without Spaces : 23 */