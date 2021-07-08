import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int a=s.nextInt();
		int ar[]=new int[a];
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<a;i++)
			ar[i]=s.nextInt();
		int even=0,odd=0;
		for(int j=0;j<a;j++){
			if(ar[j]%2==0)
				even++;
			else
				odd++;
		}
		String res=((even*odd)%2==0)?"Even":"Odd";
		System.out.println("The Final Output is " +res+" Number ");
	}
}
/*-----------------------------------------
Output : 
Enter the Array Size : 5
Enter the Array Elements :
23
45
56
78
34
The Final Output is Even Number*/