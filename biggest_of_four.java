import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Your Four Numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int res=(a>b&&a>c&&a>d)?a:(b>c&&b>d)?b:(c>d)?c:d;
		System.out.println(res+ " is The Biggest Among Four of them");
	}
}