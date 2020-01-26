import java.util.Scanner;
class Factorial
{
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number..");
		int num=sc.nextInt();

		int res=1;
		/*for(int i=num;i>0;i--)
		{	
			res=res*i;
		}*/
		int i=num;
		while(i>0){
			res=res*i;
			i--;
		}
		System.out.println(num +"!="+res);
	}
		
}
