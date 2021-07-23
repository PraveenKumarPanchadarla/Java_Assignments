import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Hashtable<Integer,Integer> x=new Hashtable<Integer,Integer>();
		int h=5000;
		System.out.print("Enter the Number Of Entries : ");
		int l=s.nextInt();
		System.out.println("Enter the Employee IDs & Salaries : ");
		for(int i=0;i<l;i++)
			x.put(s.nextInt(),s.nextInt());
		System.out.print("Enter the Employee ID to Hike thier Salary by 5000 : ");
		int id=s.nextInt();
		if(x.containsKey(id)){
			x.put(id,x.get(id)+5000);
			System.out.println("After Updating the Details : ");
			System.out.println(x);
		}
		else
			System.out.println("Not Found");
	}
}
/*-----------------------------------------
Output : 
Enter the Number Of Entries : 5
Enter the Employee IDs & Salaries :
101 20000
102 30000
103 10000
104 50000
105 35000
Enter the Employee ID to Hike thier Salary by 5000 : 105
After Updating the Details :
{105=40000, 104=50000, 103=10000, 102=30000, 101=20000}
*/