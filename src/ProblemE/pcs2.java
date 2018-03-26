package ProblemE;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class pcs2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		Vector<Integer> vect=new Vector<Integer>();
		for(int j=0; j<N; j++) {
			int a=sc.nextInt();
			vect.addElement(a);
		}
		Collections.sort(vect);
		System.out.println(vect.elementAt(K-1));
		

	}

}
