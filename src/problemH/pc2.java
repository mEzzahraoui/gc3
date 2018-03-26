package problemH;

import java.util.Scanner;

public class pc2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0; i<t; i++) {
			int k=sc.nextInt();
			double x1=(-2-Math.sqrt(4*k))/2;
			double x2=(-2+Math.sqrt(4*k))/2;
			if(x2<0)
				System.out.println(0);
			else if (x1<0)
			{
				if(x2>(int)x2)
					System.out.println((int)x2+1);
				else
					System.out.println((int)x2);
			}
			else{
				if(x1>(int)x1)
					System.out.println((int)x1+1);
				else
					System.out.println((int)x1);
			}
		}

	}

}
