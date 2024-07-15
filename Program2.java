package Practice; 

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enetr the Number");
		int a=n.nextInt();
		if(a%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is odd");
	}

}
