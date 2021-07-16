import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		System.out.println("Enter the Five  Elements Of First List : ");
		for(int i=0;i<5;i++){
		int n=s.nextInt();
		a.add(n);
		}
		System.out.println("Enter the Five  Elements Of Second List : ");
		for(int i=0;i<5;i++){
		int m=s.nextInt();
		b.add(m);
		}
		System.out.println("The First Array is : "+a);
		System.out.println("The Second Array is : "+b);
		b.addAll(a);
		Collections.sort(b);
		System.out.println("After the Both Lists got Sorted into One : "+b);
	}
}
/*-----------------------------------------
Output :
Enter the Five  Elements Of First List :
10
40
30
20
50
Enter the Five  Elements Of Second List :
300
200
600
500
700
The First Array is : [10, 40, 30, 20, 50]
The Second Array is : [300, 200, 600, 500, 700]
After the Both Lists got Sorted into One : [10, 20, 30, 40, 50, 200, 300, 500, 600, 700]
