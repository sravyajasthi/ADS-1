import java.util.Scanner;
import java.util.Stack;
class A
{

	Stack<String> stack=new Stack<String>();
	void peek(String a,int n)
	{
		if(stack.empty()&&(a.equals("{")||a.equals("["))) 
			stack.push(a);
		else
		{
			if(a.equals("{")||a.equals("["))
				stack.push(a);
						
		if(a.equals("}")||a.equals("]"))
		{
			String b=stack.pop();
			if(b.equals("[")&&a.equals("]")) {
				
				System.out.println("yes");
				
			}
			else if(b.equals("{")&&a.equals("}")) 
			{
				
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
			
			
		}	
		
	}
	}
	
	
	





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		A a1=new A();
		String a;
		int n=0;
		while(sc.hasNext())
		{
			
			a1.peek(sc.next(),n);
			n++;
		}
		
		
	}

}
