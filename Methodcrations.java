package ornekCozumu;

import java.util.Scanner;

public class Methodcrations {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini isteyin
				// iki farkli method olusturun methodlardan biri girilen kelimeleri 
				//   ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
				// Ikinci method Isim ve soyismin ilk harfleri buyuk harf,
				//   kalan harfler * olacak sekilde birlestirsin
				
				// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
				// ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde kullanin
				
		Scanner scan =new Scanner(System.in);
		
	System.out.println("lutfen adinizi ve soyadinizi girin ve \n adinizi giediken sonra entera basin");
	
	String isim=scan.next();
	String soyisim=scan.next();
	
	System.out.println("Isminizin acik sekilde yazilmasini istiyorsani 1 "
	
					+ "\nIlk harf haric gizli yazilmasini istiyorsaniz 2'e basin");
	
	int tercih=scan.nextInt();
	
	// bu satira kadar kullanicidan ismini, soyismini ve tercihini aldim
	String birlesmisIsim=null;//Emrah Saglam'E**** S*****
	
if (tercih==1) {
	birlesmisIsim =acikIsim(isim,soyisim);
} else if(tercih==2) {
	birlesmisIsim =isimGizle(isim,soyisim);

	}else {
	System.out.println("Lutfen 1 veya 2 secin");	
	}
//Bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli olarak
		// kaydedildi
	System.out.println("Kullanicinin tercihi :" + birlesmisIsim);}
	


	public static String isimGizle(String isim, String soyisim) {
		isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
		soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
		
		return isim+""+soyisim;
		
		
	}

	public static String acikIsim(String isim, String soyisim) {
		isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
		soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
		
		return isim+""+soyisim;

	}

}
