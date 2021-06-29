import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number");
		int a=s.nextInt();
		int odd=0,even=0,res;
		String b=String.valueOf(a);
		for(int i=0;i<b.length();i++){
			int x =(b.charAt(i));
			if(x%2==0)
			even++;
			else
			odd++;
		}
		System.out.println("Number of Even digits : "+even);
		System.out.println("Number of Odd digits : "+odd);
	}
}