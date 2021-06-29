import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter An Alphabet : ");
		char a=s.next().charAt(0);
		switch(a)
		{
			case 'a':
			System.out.println(a+" is an Vowel");
			break;
			case 'e':
			System.out.println(a+" is an Vowel");
			break;
			case 'i':
			System.out.println(a+" is an Vowel");
			break;
			case 'o':
			System.out.println(a+" is an Vowel");
			break;
			case 'u':
			System.out.println(a+" is an Vowel");
			break;
			default:
			System.out.println(a+" is a Consonant");
		}
	}
}