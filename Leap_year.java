import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Year");
		int year=s.nextInt();
		String m=(year%4==0)?" A Leap ":" Not A Leap ";
		System.out.println(year+" is"+m+"Year");
	}
}