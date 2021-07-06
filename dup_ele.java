import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int size=s.nextInt();
		int ar[]=new int[size];
		int c=0;
		for(int i=0;i<size;i++){
			ar[i]=s.nextInt();
		}
		System.out.print("The Duplicate Values are : ");
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(ar[i]==ar[j]){
				System.out.print(ar[i]+" ");
				c++;
				}
			}
		}
			if (c==0)
			System.out.println("There are No Duplicate Elements in the Array");
	}
}
/*-----------------------------------------
Output :
Enter the Array Size : 5
24
56
35
56
35
The Duplicate Values are : 56 35 */