class SumOfNum
{
	public static void main(String[] args)
	{
		System.out.println("MMS");

		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
		}
	
		System.out.println("sum of total number is "+sum);
		System.out.println("...........................");

		int evenSum=0;
		int oddSum=0;

		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				evenSum=evenSum+i;
			}
			else
			{
				oddSum=oddSum+i;
			}
		}
		System.out.println("even sum of numbers is "+evenSum);

		System.out.println("odd sum of numbers is "+oddSum);
		
		System.out.println("MME");

	}


}