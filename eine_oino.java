import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ind=0,ex=1;
		System.out.print("How Many Elements Do you want to Check ? --> ");
		int l=s.nextInt();
		int ar[]=new int[l];
		int br[]=new int[l];
		System.out.println("Enter "+l+" Elements");
		for(int i=0;i<l;i++)
			ar[i]=s.nextInt();
		for(int i=0;i<l;i++){
			if(ar[i]%2==0){
				br[ind]=ar[i];
				ind+=2;
			}
			else{
				br[ex]=ar[i];
				ex+=2;
			}
		}
		System.out.println("After Placing Even in Even & Odd in Odd : ");
		for(int i=0;i<l;i++)
			System.out.print(br[i]+" ");
	}
}
/*-----------------------------------------
Output : 
How Many Elements Do you want to Check ? --> 5
Enter 5 Elements
1
2
4
5
6
After Placing Even in Even & Odd in Odd :
2 1 4 5 6 */