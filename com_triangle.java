import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int a=s.nextInt();
		System.out.println("The Output of the Pattern is : ");
		for(int i=0;i<a;i++){
			for(int j=0;j<i+1;j++){
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=a;i>0;i--){
			for(int k=0;k<i-1;k++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
/*
Output :
Enter The Number :
6
The Output of the Pattern is :
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *  
 
*/