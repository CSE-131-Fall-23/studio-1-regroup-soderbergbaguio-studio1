package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Select two integers to average together: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println((n1 + n2)/2.0);

	}

}
