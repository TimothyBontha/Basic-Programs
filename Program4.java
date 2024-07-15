package Practice;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		int m;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scanner.nextInt();
		m=n/2;
		if(n<=1) 
			System.out.println(n+"is not a prime Number");
		else
			for(int i=2;i<=m;i++) {
				if(n%i==0)
					System.out.println(n+"is a prime number");
					else
						System.out.println(n+"is not a prime number");
			}
	}
}
