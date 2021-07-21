import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				ArrayList<Integer>x=new ArrayList<Integer>();
		System.out.print("Enter the List Size : ");
		int n=s.nextInt();
		System.out.println("Enter the List Elements : ");
		for(int i=0;i<n;i++)
			x.add(s.nextInt());
			Iterator <Integer> it=x.iterator();
			System.out.print("Select An Element From the List : ");
			int k=s.nextInt();
			for(int i=0;i<n;i++){
				if(it.next()<=k){
					it.remove();
				}
			}
			System.out.println("The Elements Greater Than "+k+" are : ");
			for(int i:x)
				System.out.print(i+" ");			
	}
}
/*-----------------------------------------
Output : 
Enter the List Size : 6
Enter the List Elements :
10
20
30
40
50
60
Select An Element From the List : 30
The Elements Greater Than 30 are :
40 50 60
*/