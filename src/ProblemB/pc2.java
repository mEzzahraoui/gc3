package ProblemB;

import java.util.Scanner;

public class pc2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<T; i++) {
			String text=sc.nextLine();
			String[] texts=text.split(" / ");
			int a=Integer.parseInt(texts[0]);
			int b=Integer.parseInt(texts[1]);
			if(a%b==0) {
				System.out.println(a/b);
			}
			else {
				int PGCD=pgcd(a,b);
				System.out.println((a/PGCD)+" / "+(b/PGCD));
			}
		}
	}
	
	public static int pgcd(int a, int b) {
		if(a==0) return b;
		if(b==0) return a;
		if(a>b) return pgcd(a%b, b);
		return pgcd(b%a, a);
	}

}
