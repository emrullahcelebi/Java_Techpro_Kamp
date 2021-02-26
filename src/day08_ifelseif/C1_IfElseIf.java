package day08_ifelseif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		/*Kullanicidan gun ismini yazmasini isteyin. 
		 * Girilen isim gecerli bir gun ise gun isminin
		 *  1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, 
		 * gun  ismi  gecerli degilse �Gecerli gun ismi giriniz� yazdirin
		 */

		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Lutfen bir gun ismi giriniz");
		
		String gunIsmi= scan.nextLine();
		
		if(gunIsmi.equalsIgnoreCase("pazar") || gunIsmi.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		}else if(gunIsmi.equalsIgnoreCase("sali")){
			System.out.println("Sal");
		}else if(gunIsmi.equalsIgnoreCase("carsamba")) {
			System.out.println("Car");
		}else if(gunIsmi.equalsIgnoreCase("persembe")) {
			System.out.println("Per");
		}else if(gunIsmi.equalsIgnoreCase("cuma") || gunIsmi.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
		}else {
			System.out.println("Lutfen gecerli gun ismi giriniz");
		}
		//equalsIgnorCase ()  : methodu iki String in buyuk kucuk harf hassasiyeti
		//olmadan esit olup olmadigini kontrol eder
		
		
		scan.close();
		
	}

}
