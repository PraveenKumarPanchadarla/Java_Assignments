import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter The Array Size : ");
		int size=s.nextInt();
		int ar[]=new int[size];
		int br[]=new int[size];
		int b=0;
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<size;i++){
			ar[i]=s.nextInt();
		}
		for(int j=0;j<size;j++){
			if(ar[j]!=0){
				br[b]=ar[j];
				b++;
			}
		}
		for(int k=0;k<size;k++){
			if(ar[k]==0){
				br[b]=ar[k];
				b++;
			}
		}
		for(int n=0;n<size;n++){
				System.out.print(br[n]+" ");
		}
				
	}
}
/*-----------------------------------------
Enter The Array Size : 5
Enter the Array Elements :
24
0
457
0
3456
24 457 3456 0 0 */