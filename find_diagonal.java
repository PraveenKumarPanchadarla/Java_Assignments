import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Matrix Size : ");
		int a=s.nextInt();
		int c=0;
		int ar[][]=new int[a][a];
		System.out.println("Enter the Elements : ");
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				ar[i][j]=s.nextInt();
			}
		}
		System.out.println("The Matrix is : ");
		for(int k=0;k<a;k++){
			for(int l=0;l<a;l++){
				System.out.print(ar[k][l]+" ");
			}
			System.out.println( );
		}
		for(int i =0;i<a;i++){
			for(int j=0;j<a;j++){
				if(ar[i][j]!=0)
				c++;
			}
		}
		String x=(c==a)?"Diagonal":"Not Diagonal";
		System.out.print("The Above Matrix is " +x);
	}
}
/*-----------------------------------------
Output : 
Enter the Matrix Size : 3
Enter the Elements :
1
0
0
0
2
0
0
0
3
The Matrix is :
1 0 0
0 2 0
0 0 3
The Above Matrix is Diagonal */