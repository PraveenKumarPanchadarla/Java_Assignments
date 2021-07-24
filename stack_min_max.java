import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the Number Of Elements : ");
		int l=s.nextInt();
		Stack x=new Stack();
		System.out.println("Enter the Elements : ");
		for(int i=0;i<l;i++)
			x.push(s.nextInt());
		System.out.println("The Maximum Value : "+Collections.max(x));
		System.out.println("The Minimum Value : "+Collections.min(x));
	}
}
/*-----------------------------------------
Output : 
Enter the Number Of Elements : 5
Enter the Elements :
12
24
576
45
98
The Maximum Value : 576
The Minimum Value : 12
*/