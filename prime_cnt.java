import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int a=s.nextInt();
		int ar[]=new int[a];
		int count=0,cntop=0;
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<a;i++)
			ar[i]=s.nextInt();
		for(int j=0;j<a;j++){
			for(int k=1;k<ar[j];k++){
				if(ar[j]%k==0)
					count++;
			}
			if(count==1)
				++cntop;
			count=0;
		}
		System.out.println("The Total Count of the Prime Numbers in the Array : "+cntop);	
	}
}
/*-----------------------------------------
Output : 
Enter the Array Size : 4
Enter the Array Elements :
3
4
5
6
The Total Count of the Prime Numbers in the Array : 2*/