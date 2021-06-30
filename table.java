import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number to get Multiples of it upto 10");
		int a=s.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(a+" x "+i+" = "+a*i);
		}
	}
}
/*-------------------------------------
Output :
Enter the Number to get Multiples of it upto 10 : 2
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20*/
