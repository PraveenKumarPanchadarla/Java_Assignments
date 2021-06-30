import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a=s.nextInt();
		String even="",odd="";
		String x=String.valueOf(a);
		for(int i=0;i<x.length();i++){
			int b=x.charAt(i);
			if (b%2==0)
				even+=x.charAt(i);
			else
				odd+=x.charAt(i);
		}
		System.out.println(even+" "+odd);
			
	}
}
/*-------------------------------------
Output :
Enter the Number : 12345678
2468 1357*/