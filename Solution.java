public class Paires 
{
	public static void main(String[]args)
	{
		int a[]=new int[20];
		//int b[]=new int[20];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<10;i++)
			a[i]=scan.nextInt();
		int a1=0,c=0,d=0;
		for(int i=0;i<10;i++)
		{
			c=1;
			for(int j=0;j<10;j++)
				if(a[i]==a[j]&&i!=j)
					c++;
			/*b[d]=a[i];
			d++;
			int sum=0;
			for(int i1=0;i1<=d;i1++)
				if(a[i]==b[i1])
					sum++;*/
			//if(sum<2)
			//{
				if(c%2==0)
					System.out.println(a[i]+"="+c/2+" pairs");
				else
					System.out.println(a[i]+"="+(c-1)/2+"pairs");
			//}
				
			
		}
		
	}
}