package ProblemD;

import java.util.Scanner;

public class pc2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<T; i++) {
			String text=sc.nextLine();
			int sum=0;
			for(int j=0; j<text.length(); j++) {
				sum+=Math.pow(-1, j)*text.charAt(j);
			}
			System.out.println(sum*sum);
			
		}
	}
}
