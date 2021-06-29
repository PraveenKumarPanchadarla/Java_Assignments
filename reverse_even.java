import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Range");
		System.out.println("Starting Range : ");
		int a=s.nextInt();
		System.out.println("Ending Range : ");
		int b=s.nextInt();
		int i=b;
		while((i<=b)&&(i>=a)){
			if(i%2==0)
				System.out.println("\n"+i);
			i--;
		}
	}
}