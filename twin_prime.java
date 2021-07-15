import java.util.*;
public class Main {
	public static void twinprime(int x,int y){
		int tp[]=new int[(y-x)+2];
		int t=0;
		for(int i=x;i<=y;i++){
			int c=0;
			for(int j=1;j<=i;j++){
				if(i%j==0)
					c++;
			}
				if (c==2){
				tp[t]=i;
				t++;
				}
			}
			System.out.println("The Set Of Twin Primes Between "+x+" and "+y+" is : ");
			for(int i=0;i<tp.length-1;i++){
				if(tp[i+1]-tp[i]==2)
					System.out.println("("+tp[i]+","+tp[i+1]+")");
			}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Starting Range : ");
		int a=s.nextInt();
		System.out.print("Enter the Ending Range : ");
		int b=s.nextInt();
		twinprime(a,b);
	}
}
/*-----------------------------------------
Output :
Enter the Starting Range : 1
Enter the Ending Range : 100
The Set Of Twin Primes Between 1 and 100 is :
(3,5)
(5,7)
(11,13)
(17,19)
(29,31)
(41,43)
(59,61)
(71,73) */