import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LinkedList<Integer> x=new LinkedList<Integer>();
		System.out.print("Enter the Size Of Linked List : ");
		int l=s.nextInt();
		System.out.println("Enter the Elements : ");
		for(int i=0;i<l;i++)
			x.add(i,s.nextInt());
			System.out.println("The Ouput is :");
		for(Integer i:x)
			System.out.println(i);
	}
}
/*-----------------------------------------
Output : 
Enter the Size Of Linked List : 4
Enter the Elements :
12
16
10
20
The Ouput is :
12
16
10
20 */