import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Size of First Array : ");
		int a=s.nextInt();
		System.out.print("Enter the Size of Second Array : ");
		int b=s.nextInt();
		int ar[]=new int[a];
		int br[]=new int[b];
		System.out.println("Enter the Elements into First Array : ");
		for(int i=0;i<a;i++)
			ar[i]=s.nextInt();
		System.out.println("Enter the Elements into Second Array : ");
		for(int j=0;j<b;j++)
			br[j]=s.nextInt();
		Arrays.sort(ar);
		Arrays.sort(br);
		System.out.println("Max of First Array is : "+ar[a-1]+"\n"+"Min of Second Array is : "+br[0]);
		System.out.println("The Product of "+ar[a-1]+" and "+br[0]+" is : "+ar[a-1]*br[0]);
		
	}
}