import java.util.*;
public class line_rev {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String Data : ");
		String x=s.nextLine();
		String y[]=x.split(" ");
		String z="";
		int l=y.length;
		String ar[]=new String[l];
		for(int i=0;i<l;i++){
			int k=y[i].length();
			for(int j=k-1;j>=0;j--){
				z+=y[i].charAt(j);
				ar[i]=z;
			}
			z="";
		}
		System.out.println("Reverse of the Entire line  : ");
		for(int i=0;i<l;i++)
			System.out.print(ar[i]+" ");
	}
}
/*-----------------------------------------
Output : 
Enter the String Data  :
the name is sherlock holmes
Reverse Of the Entire Line : 
eht eman si kcolrehs semloh */