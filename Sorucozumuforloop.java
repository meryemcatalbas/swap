package ornekCozumu;

import java.util.Scanner;

public class Sorucozumuforloop {

	public static void main(String[] args) {
		/*
		Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve 
		girilen rakama gore asagidaki sekli cizdirin
		*
		* *
		* * *
		* * * * 

		for (int satirNo = 1; satirNo <=rakam; satirNo++) {
			
			for (int i = 1; i <=satirNo ; i++) {
				System.out.print("* ");
			

		 */
/*Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir rakam giriniz");
int rakam=scan.nextInt();
for (int satirNo = 1; satirNo <=rakam; satirNo++) {
	for (int i = 1; i <=satirNo; i++) {
		System.out.print("*");
	}
}*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz");
		int rakam = scan.nextInt();
		
		// mesela kullanici 5 girmis olsun
		
		for (int satirNo = 1; satirNo <=rakam; satirNo++) {
			
			for (int i = 1; i <=satirNo ; i++) {
				System.out.print("* ");
				
			}
			
			System.out.println("");
		}
		scan.close();


		
	System.out.print("");
	}

}
