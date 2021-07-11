import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		 int a=s.nextInt();
		 System.out.print("Select an Option Among these Conversions : \n 1) Binary \n 2) Octal \n 3) HexaDecimal \n Enter : ");
		 int c=s.nextInt();
		 String res;
		 switch (c){
		 	case 1 : 
		 		res=Integer.toBinaryString(a);
		 		System.out.println("After the Conversion that you Choose : "+res);
		 		break;
		 	case 2 :
		 		res=Integer.toOctalString(a);
		 		System.out.println("After the Conversion that you Choose : "+res);
		 		break;
		 	case 3 :
		 		res=Integer.toHexString(a);
		 		System.out.println("After the Conversion that you Choose : "+res);
		 		break;
		 	default :
		 		System.out.println("Choose the Correct Option Please :");
		 }		 
	}
}
/*-----------------------------------------
Enter the Number : 221
Select an Option Among these Conversions :
 1) Binary
 2) Octal
 3) HexaDecimal
 Enter : 2
After the Conversion that you Choose : 335
*/