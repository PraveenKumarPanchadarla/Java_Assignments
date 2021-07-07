import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter The Array size : ");
		int size=s.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<size;i++)
			ar[i]=s.nextInt();
		Arrays.sort(ar);
		System.out.println(" min = "+ar[0]+" , " +"max = "+ar[size-1]);
	}
}