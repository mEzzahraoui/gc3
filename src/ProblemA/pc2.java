package ProblemA;

import java.util.Scanner;

public class pc2 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext()) {
			String name=sc.nextLine();
			String voyels="aeiouy";
			int nb=0;
			String WordsInName[]=name.split(" ");
			for(int i=0; i<voyels.length(); i++) {
				nb+=compterOccurrences(name, voyels.charAt(i)+"");
			}
			
			System.out.println(nb+" "+WordsInName.length);
			
			if(nb==(WordsInName.length)*2) {
				System.out.println("NP");
			}
			else {
				System.out.println("P");
			}
			
		}
		long endTime = System.nanoTime();

		System.out.println((endTime - startTime)/1000000);
	}
	
	public static int compterOccurrences(String maChaine, String recherche)
	{
	 return maChaine.length() - maChaine.replace(recherche, "").length();
	}

}
