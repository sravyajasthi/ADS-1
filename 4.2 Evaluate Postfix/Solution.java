import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class STACK {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner (System.in);
	Stack<Integer> ob=new Stack<>();
		
	while(sc.hasNext())
	{
		System.out.println("enter a value");
		String a=(sc.next());

		if(a.equals("*")||a.equals("-")||a.equals("/")||a.equals("+"))
		{
			int p=ob.pop();
			int p2=ob.pop();
			if(a.equals("*"))
				ob.push(p*p2);
			else if(a.equals("-"))
				ob.push(p-p2);
			else if(a.equals("/"))
				ob.push(p/p2);
			else if(a.equals("+"))
				ob.push(p+p2);
			
		}
		else 
		{
			
			int a1= Integer.parseInt(a);
			ob.push(a1);
		}
		
	}
	System.out.println(ob);
	}
}
