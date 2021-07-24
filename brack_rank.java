import java.util.*;
class Solution{
	public static String isValid(String str){
	Stack<Character> st=new Stack<Character>();
	char[] ch=str.toCharArray();
	char t;
	for(char i:ch){
		t=st.empty()?'*':st.peek();
		if(t=='(' && i==')')
			st.pop();
		else
			if(t=='{' && i=='}')
				st.pop();
			else
				if(t=='[' && i==']')
					st.pop();
			else
				st.push(i);
	}
		return (st.empty()?"YES":"NO");
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.print(isValid(str));
	}
}
/*-----------------------------------------
Output : 
({})
YES
*/