package Practice;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		int fact=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++)
			fact*=i;
		System.out.println(fact);
	}
	

}
