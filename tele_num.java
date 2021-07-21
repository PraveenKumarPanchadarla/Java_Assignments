import java.util.*;
import java.io.*;
class Solution{
	public static void main(String []argh){
		Scanner sc = new Scanner(System.in); int n = sc.nextInt();
		HashMap<String,Integer> x=new HashMap<String,Integer>();
		for(int i = 0; i < n; i++){
			String name = sc.next();
			int phone = sc.nextInt();
			x.put(name,phone); 
		}
		while(sc.hasNext())
		try{
			for(int j=0;j<n;j++){
				String s = sc.next();
				if(x.containsKey(s))
					System.out.println(s+"="+x.get(s));
				else
					System.out.println("Not found");
			}
		}
		catch(Exception e){}
		sc.close();
	}
}
/*-----------------------------------------
Output : 
3
sherlock
12344567
john
34556789
greg
23457324
sherlock
sherlock=12344567
molly
Not found
john
john=34556789
*/