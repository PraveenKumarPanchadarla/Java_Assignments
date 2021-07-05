import java.util.*;
public class Main {
	public static void main(String[] args) {
	   	System.out.print("Enter The Number:");
	   	Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("The Output Of the Pattern is : ");
	   for(int i=1;i<=n;i++)
	   {
	   	for(int j=1;j<=(2*i)-1;j++)
	   	{
	   		System.out.print("*");
	   	}
	   	System.out.println("\n"+"\n");
	   }
	   for(int i=1;i<n;i++)
	   {
	   	for(int k=1;k<=2*(n-i)-1;k++)
	   	{
	   		System.out.print("*");
	   	}
	   	System.out.println("\n"+"\n");
	   }
	}
}
/*-----------------------------------------
Output : 
Enter The Number:4
The Output Of the Pattern is :
*


***


*****


*******


*****


***


*
-----------------------*/