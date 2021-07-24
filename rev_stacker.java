import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String y=s.next();
		char ch[]=y.toCharArray();
		Stack x=new Stack();
		System.out.println("After the String Gets Reversed : ");
		for(int i=ch.length-1;i>=0;i--){
			x.push(ch[i]);
			System.out.print(x.pop());
		}
	}
}
/*-----------------------------------------
Output : 
Enter the String : SHERLOCK
After The String Gets Reversed : KCOLREHS
*/