import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int a=s.nextInt();
		System.out.print("Enter the No. Of Right Rotations : ");
		int x=s.nextInt();
		System.out.print("Enter the No. Of Left Rotations : ");
		int y=s.nextInt();
		int c=0,d=1;
		int ar[]=new int[a];
		int br[]=new int[a];
		int cr[]=new int[a];
		System.out.println("Enter The Array Elements : ");
		for(int i=0;i<a;i++)
			ar[i]=s.nextInt();
		for(int j=a-x;j<=a-1;j++){
			br[c]=ar[j];
			c++;
		}
		for(int i=a-x-1;i>=0;i--){
		br[a-d]=ar[i];
		d++;
		}
		for(int i=0;i<a;i++) {
			if((i-y)<0)
				cr[a+i-y]=br[i];
			else
				cr[i-y]=br[i];
		}
		System.out.print("After the "+x+" Right Rotations and "+y+" Left Rotations :  ");
		for(int i=0;i<a;i++)
			System.out.print(cr[i]+" "); 
	}
}
/*-----------------------------------------
Output : 
Enter the Array Size : 5
Enter the No. Of Right Rotations : 3
Enter the No. Of Left Rotations : 4
Enter The Array Elements :
1
2
3
4
5
After the 3 Right Rotations and 4 Left Rotations : 2 3 4 5 1*/