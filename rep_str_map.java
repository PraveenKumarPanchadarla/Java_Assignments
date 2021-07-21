import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		HashMap<String,Integer> x=new HashMap<String,Integer>();
		System.out.print("Enter the Size Of the String Array : ");
		int l=s.nextInt();
		String []arr=new String[l];
		System.out.println("Enter Strings : ");
		for(int i=0;i<l;i++)
			arr[i]=s.next();
		for(int i=0;i<l;i++){
			if(x.containsKey(arr[i]))
				x.put(arr[i],x.get(arr[i])+1);
			else
				x.put(arr[i],1);
		}
		System.out.println("More than Two Times These Strings are Repeated : ");
		for(Map.Entry<String,Integer>i:x.entrySet()){
			if (i.getValue()>2)
				System.out.println(i.getKey()+"="+i.getValue());
		}
	}
}
/*-----------------------------------------
Output : 
Enter the Size Of the String Array : 10
Enter Strings :
sherlock
john
molly
hudson
john
sherlock
molly
john
sherlock
john
More than Two Times These Strings are Repeated :
john=4
sherlock=3
*/