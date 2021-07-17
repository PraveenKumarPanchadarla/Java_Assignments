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
		System.out.println(x);
		System.out.print("Enter the Element to Search in the Above LinkedList : ");
		int n=s.nextInt();
		if (x.contains(n)){
			x.remove(x.indexOf(n));
			System.out.println("After Deleting "+n);
			for(Integer i:x)
				System.out.print(i+" ");
		}
		else
			System.out.println(n+" is not in the Linked List ");
			
	}
}
/*-----------------------------------------
Output : 
Enter the Size Of Linked List : 5
Enter the Elements :
11
22
33
44
55
[11, 22, 33, 44, 55]
Enter the Element to Search in the Above LinkedList : 44
After Deleting 44
11 22 33 55*/
