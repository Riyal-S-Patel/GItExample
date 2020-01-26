class Fibonacci
{
	public static void main(String[] args)
	{
		int n1=0;
		int n2=1; 
		
		System.out.println(n1+"\n"+n2);
		int res=0;

		/*for(int i=0;i<=8;i++)
		{
			res=n1+n2;
			System.out.println(res);
			n1=n2;
			n2=res;
		}*/
		int i=0;
		while(i<=8)
		{
			res=n1+n2;
			n1=n2;
			n2=res;
			i++;
			System.out.println(res);
		}
	
	}
}