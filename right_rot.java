import java.util.*; 
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.print("Enter The Array Size : ");
		int n=sc.nextInt();
		int j=n-1;
		System.out.print("Enter the No. Of Rotations : ");
		int r=sc.nextInt();
		int ar[]=new int[n];
		int br[]=new int[n];
		System.out.println("Enter Array Elements : ");
		for(i=0;i<n;i++)
		ar[i]=sc.nextInt();
		for(i=0;i<n;i++) {
			 if((i-r)<0) {
			 	 br[n+i-r]=ar[j];
			 }
			 else
			 br[i-r]=ar[j];
			 j--;	 
		}
		System.out.println("After "+r+" Rotations : ");
		for(i=n-1;i>=0;i--)
			System.out.print(br[i]+" "); 
	}
}
/*-----------------------------------------
Output : 
Enter The Array Size : 5
Enter the No. Of Rotations : 4
Enter Array Elements :
1
2
3
4
5
After 4 Rotations :
2 3 4 5 1*/