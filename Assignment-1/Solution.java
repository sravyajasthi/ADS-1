import java.util.LinkedList;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Stack;
class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
    	LinkedList node=new LinkedList();
    	for(int i=0;number!="\0";i++)
    	{
    		node.add(number.valueOf(i));
    	}
    		
		return node;

    }

    public static String digitsToNumber(LinkedList list) {
    	String s=null;   
    	int n=list.size();
    	for(int i=0;i<=n;i++)
    	{
    		s=(String) list.get(i);
    	}
    	
    	
		return s;

    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	Stack st=new Stack();
    	int n=list1.size();
    	for(int i=0;i<n;i++)
    	{
    		
    		String x= (String) list1.get(i);
    		st.add(x);
    	}
    	System.out.println(st.addAll(st));
    	int m=st.size();
    	for(int i=0;i<m;i++)
    		list2.add(st.pop());
		return list2;

    }
}

public class Solution {
    public static void main(String[] args) {
    	System.out.println("hi");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        System.out.println("hi1");
        LinkedList pDigits=null ;
        System.out.println("hi3");
        LinkedList qDigits=null ;
        switch(input){
            case "numberToDigits":
               System.out.println("Hi");
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);

                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println("hiiasdf");
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
               
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
