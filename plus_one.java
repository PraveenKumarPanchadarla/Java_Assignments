import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int a=s.nextInt();
		int ar[]=new int[a];
		String b="";
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<a;i++)
			ar[i]=s.nextInt();
		for(int i=0;i<a;i++){
			String x=String.valueOf(ar[i]);
			b+=x;
		}
		int c=Integer.valueOf(b)+1;
		System.out.println("The Final Result is " +c);
			
	}
}
/*-----------------------------------------
Output : 
Enter the Array Size : 5
Enter the Array Elements :
2
4
5
7
9
The Final Result is 24580*/