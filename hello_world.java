import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String x=s.next();
		String g="";
		int cnt=0;
		StringBuilder sb=new StringBuilder(x);
		System.out.print("Enter the Number Of Operations : ");
		int q=s.nextInt();
		for(int i=1;i<=q;i++){
			System.out.print("Enter the Position to replace ");
			int p=s.nextInt();
			System.out.print("Enter the Character to replace : ");
			String c=s.next();
			sb=sb.replace(p-1,p,c);
//			System.out.println(sb);
		}
		String r=sb.toString();
		String y=sb.toString();
		StringBuilder yd=new StringBuilder(y);
		System.out.println("After "+q+" No. Of Times The Operation Performed :  " + y);
		System.out.print("Enter the Number Of Operations : ");
		int m=s.nextInt();
		for(int i=1;i<=m;i++){
			System.out.print("Enter the Starting range to get reversed : ");
			int f=s.nextInt();
			System.out.print("Enter the Ending range to get reversed : ");
			int e=s.nextInt();
			for(int k=f;k<=e;k++){
				char ch[]=new char[(e-f)+e];
				int t=(e-f)+e-1;
				ch[t]=y.charAt(k-1);
				String w="";
				w+=ch[t];
				t--;
				g+=w;
			}
			StringBuilder gd=new StringBuilder(g);
			gd=gd.reverse();
			g=gd.toString();
			yd=yd.replace(f-1,e,g);
			y=yd.toString();
//			System.out.println(y);
			g="";
		}
		System.out.println("After "+m+" No. Of Times The Operation Performed :  " + y);
		for(int i=0;i<y.length();i++){
			if(r.charAt(i)==y.charAt(i))
				cnt++;
		}
		System.out.println("Number of Characters same in both of them : "+cnt);
	}
}
/*-----------------------------------------
Output : 
Enter the String :
helloworld
Enter the Number Of Operations : 2
Enter the character to replace a
Enter the Position to replace : 1
Enter the character to replace x
Enter the Position to replace : 8
After 2 No. Of Times The Operation Performed :  aellowoxld
Enter the Number Of Operations : 2
Enter the Starting range to get reversed : 2
Enter the Ending range to get reversed : 3
Enter the Starting range to get reversed : 2
Enter the Ending range to get reversed : 4
After 2 No. Of Times The Operation Performed :  alelowoxld
Number of Characters same in both of them : 8
*/