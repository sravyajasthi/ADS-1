import java.util.LinkedList;
import java.util.Scanner;


public class Solution {
	LinkedList l1=new LinkedList();
	void creationofStack(int n)
	{
		
		for(int i=0;i<n;i++)
		{
			l1.add(i);
		}
	}
	void Speaces(int s,int n) {
		for(int i=0;i<s;i++)
		{
			while(!l1.isEmpty())
			{
				for(int j=0;j<s;j++)
				{
					if(j==s-1)
					{
						System.out.print(l1.pop());
						
					}
					else
					{
						l1.add(l1.pop());
						
					}
			
			}
		}
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		Solution ns=new Solution();
		for(int i=0;i<n1;i++)
		{
			int n=sc.nextInt();
		ns.creationofStack(n);
		ns.Speaces(sc.nextInt(),n);
		}
		

	}

}
