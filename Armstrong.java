import java.util.Scanner;
class Armstrong{
	public static void main(String[] args){
		System.out.println("main method started..");

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n;
		int rem=0;
		int sum=0;

		while(n>0){
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum){
			System.out.println("given number is armstrong number");
		}
		else{
			System.out.println("given number is not armstrong number");
		}
		System.out.println("main method ended..");
	}
}