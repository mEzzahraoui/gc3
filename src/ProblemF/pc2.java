package ProblemF;

import java.util.Scanner;

public class pc2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<T; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			double x=Math.sqrt((Math.pow((a+c), 2)+Math.pow(b, 2))/2);
			System.out.println( String.format( "%.6f", x) );
		}
	}
}
