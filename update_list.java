import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> x =new ArrayList<Integer>();
		System.out.print("Enter the Size Of The List : ");
		int l=s.nextInt();
		System.out.println("Enter the Elements in the List : ");
		for(int i=0;i<l;i++)
			x.add(s.nextInt());
			System.out.println(x);
			System.out.print("Select An Element From The Above List : ");
			int n=s.nextInt();
			if(x.contains(n)){
				System.out.print("Enter the Number to Update "+n+" is : ");
			int m=s.nextInt();
				x.set(x.indexOf(n),m);
				System.out.println("After Updating the Values : ");
				for(Integer i:x)
				System.out.print(i+" ");
			}
			else
				System.out.println(n+" is Not Existed in the Array List ");
					
	}
}
/*-----------------------------------------
Output : 
Enter the Size Of The List : 4
Enter the Elements in the List :
10
20
30
40
[10, 20, 30, 40]
Select An Element From The Above List : 30
Enter the Number to Update 30 is : 50
After Updating the Values :
10 20 50 40 */