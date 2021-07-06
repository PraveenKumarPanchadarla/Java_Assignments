import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int size=s.nextInt();
		int ar[]=new int[size];
		int rs[]=new int[size];
		for(int i=0;i<size;i++){
			ar[i]=s.nextInt();
		}
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(ar[i]==ar[j])
					rs[i]=ar[i];
			}
		}
		if(rs[0]==0)
			System.out.print("There are No Duplicate Elements in the Array");
		else
			System.out.print("The Duplicate Values are : ");
		for(int k=0;k<size;k++){
			if(rs[k]!=0)
			System.out.print(rs[k]+" ");
		}
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