import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int a=s.nextInt();
		char c='A';
		System.out.println("The Output Pattern of the Alphabets is : ");
		for(int i=0;i<a;i++){
			for(int j=0;j<i+1;j++){
				System.out.print(" "+c);
				c++;
			}
			System.out.println();
		}
	}
}
/*----------------------------------------
Output : 
Enter The Number :
6
The Output Pattern of the Alphabets is :
 A
 B C
 D E F
 G H I J
 K L M N O
 P Q R S T U*/