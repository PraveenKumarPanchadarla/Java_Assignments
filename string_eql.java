import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String x=s.next();
		int u=0,l=0,n=0,y=0;
		for(int i=0;i<x.length();i++){
			char ch=x.charAt(i);
			if (Character.isUpperCase(ch))
				u++;
			else
				if(Character.isLowerCase(ch))
					l++;
			else
				if(Character.isDigit(ch))
					n++;
			else
				y++;
		}
		String res=(u==l&&u==n&&u==y)?"EQUAL":"NON EQUAL";
		System.out.println("This String ( "+x+" ) is Having "+res+" Type Of Characters");
	}
}
/*-----------------------------------------
Output : 
Enter the String : HiMe4+8#
This String ( HiMe4+8# ) is Having EQUAL Type Of Characters */