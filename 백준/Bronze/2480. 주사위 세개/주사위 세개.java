import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int money = 0;
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();
		
		if(a == b && b == c) 
		{
			money = 10000 + (a * 1000);
			System.out.println(money);
		}
		else if(a == b || a == c)
		{
			money = 1000 + (a * 100);
			System.out.println(money);
		}
		else if(b == c)
		{
			money = 1000 + (b * 100);
			System.out.println(money);
		}
		else 
		{
			System.out.println((Math.max(a, Math.max(b, c)))*100);
		}
	}

}