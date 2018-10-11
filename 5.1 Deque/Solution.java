import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	LinkedList l1=new LinkedList();
	static int l=0,r=0;
	void pushLeft(int n)
	{
		l1.add(l,n);
		r++;
		display();
	}
	void pushRight(int n)
	{
		//System.out.println(r);
		l1.add(r, n);
		r++;
		display();
	}
	void size()
	{
		System.out.println(l1.size());
	}
	
	void display()
	{
		System.out.println(l1);
	}
	void popLeft()
	{
		l1.remove(l);
		r--;
		display();
		
	}
	void popRight()
	{
		l1.remove(r-1);
		r--;
		display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Solution jo=new Solution();
		for(int i=0;i<sc.nextInt();i++)
		{
			while(sc.hasNext())
			{
				switch(sc.next())
				{
					case "pushLeft":
					{
						jo.pushLeft(sc.nextInt());
						break;
					}
					case "pushRight":
					{
						jo.pushRight(sc.nextInt());
						break;
					}
					case "size":
					{
						jo.size();
						break;
					}
					case "popLeft":
					{
						jo.popLeft();
						break;
					}
					case "popRight":
					{
						jo.popRight();
						break;
					}
				}
			}
		}
	}
}
