package ProblemG;

import java.util.Scanner;

public class pc2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<T; i++) {
			int N=sc.nextInt();
			int C=sc.nextInt();
			sc.nextLine();
			int tab[][]=new int[3][N];
			for(int j=0; j<3; j++) {
				for(int l=0; l<N; l++) {
					tab[j][l]=sc.nextInt();
				}
			}
			double max=0;
			for(int j=0; j<N; j++) {
				if(j!=C-1) {
					double distance=Math.sqrt(Math.pow(tab[0][j]-tab[0][C-1], 2)+Math.pow(tab[1][j]-tab[1][C-1], 2)+Math.pow(tab[2][j]-tab[2][C-1], 2));
					max=distance>max?distance:max;
				}
			}
			System.out.println( String.format( "%.3f", max ) );
		}
	}
}
