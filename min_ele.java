import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int size=s.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<size;i++){
			ar[i]=s.nextInt();
		}
		Arrays.sort(ar);
		System.out.println("The Minimum Element in the Array is : "+ar[0]);
	}
}
/*-----------------------------------------
Output : 
Enter the Array Size : 5
2466
34672
135
46783
2356
The Minimum Element in the Array is : 135*/