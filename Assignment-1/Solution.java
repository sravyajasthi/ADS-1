import java.util.LinkedList;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Stack;
class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
    	LinkedList node=new LinkedList();
    	
    	for(int i=0;i<number.length();i++)
    	{
    		//System.out.println(number);
    		//System.out.println("4");
    		node.add(number.charAt(i));
    		//System.out.println(number.charAt(i));
    	}
    	//System.out.println(node);
    		
		return node;

    }

    public static String digitsToNumber(LinkedList list) {
    	String s="";   
    	
    	
    	//System.out.println(list);
    	for(int i=0;i<list.size();i++)
    	{
    	
    		//System.out.println(list.get(i));
    		s=s+list.get(i);
    	}
    	
    	
		return s;

    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	Stack st1=new Stack();
    	Stack st2=new Stack();
    	Stack temp=new Stack();
    	
    	LinkedList ln=new LinkedList();
    	LinkedList lf=new LinkedList();
    	for(int i=0;i<list1.size();i++)
    	{
    		st1.push(list1.get(i));
    		st2.push(list2.get(i));
    	}
    	int c;
    	for(int i=0;i<list1.size();i++)
    	{ 
    		
    		int a=Character.getNumericValue((char) st1.pop());
    		int b=Character.getNumericValue((char) st2.pop());
    		if(temp.isEmpty())
    		{
    			c= a+b;
    		
    		}
    		else 
    		{
    			int d=(int) temp.pop();
    			c=a+b+d;
    			
    		}
    		if(c>9)
    		{
    			ln.push(c%10);
    			temp.push(c/10);
    			
    		}
    		else 
    			
    			ln.push(c);
    		}
    	if(temp.isEmpty())
    	{
    		
    	}
    	else
    		ln.push(temp.pop());
    	
		
    	return ln;
}
}
public class Solution {
    public static void main(String[] args) {
    	//System.out.println("hi");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        //System.out.println("hi1");
        LinkedList pDigits=null ;
        //System.out.println("hi3");
        LinkedList qDigits=null ;
        switch(input){
            case "numberToDigits":
               //System.out.println("Hi");
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);

                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                //System.out.println("hiiasdf");
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
              // System.out.println("hi");
               pDigits = AddLargeNumbers.numberToDigits(p);
               qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                //System.out.println("hi");
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    

}
