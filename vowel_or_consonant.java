import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter An Alphabet : ");
		String a=s.next();
		String z=(a.charAt(0)=='a'||a.charAt(0)=='e'||a.charAt(0)=='i'||a.charAt(0)=='o'||a.charAt(0)=='u')?"An Vowel":"A Consonant";
		System.out.println(a+" is " +z);
	}
}