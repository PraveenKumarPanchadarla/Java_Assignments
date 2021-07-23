import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		HashMap<Integer,Integer> x=new HashMap<Integer,Integer>();
		int cnt=0,ct=0;
		System.out.print("Enter the Number Of Elements : ");
		int l=s.nextInt();
		int ar[]=new int[l];
		System.out.println("Enter the Elements : ");
		for(int i=0;i<l;i++)
			ar[i]=s.nextInt();
		for(int i=0;i<l;i++){
			if(ar[i]%5==0)
				x.put(5,++cnt);
			if(ar[i]%3==0)
				x.put(3,++ct);
		}
		System.out.println("No. Of Elements that are Divided By 3 & Divided By 5 are :");
		for(Map.Entry<Integer,Integer>i:x.entrySet()){
			System.out.println(i.getKey()+"="+i.getValue());
		}
	}
}
/*-----------------------------------------
Output : 
Enter the Number Of Elements : 6
Enter the Elements :
10
15
36
90
75
81
No. Of Elements that are Divided By 3 & Divided By 5 are :
3=5
5=4
*/