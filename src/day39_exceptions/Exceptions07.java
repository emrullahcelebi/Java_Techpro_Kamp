package day39_exceptions;

public class Exceptions07 {

	public static void main(String[] args) {
		//Data turlerini casting yapsrken uygun olmayan islem yaparssaniz
		//Java ClassCastException verir
		
		//Eger tamammen sayildan
		
		int sayi = 10;
		//String str = sayi;//CTE

		
		String str="123456";
		System.out.println(str+10);//12345610
		
		int strSayi=Integer.parseInt(str);
		System.out.println(strSayi+10);//123466
		
		String str2="123a45";
		//System.out.println(Integer.parseInt(str2));//NumberFormatExceptio
		
		
		Object sayi2=40;
		String sayiStr=(String)sayi2;//Explicit narrowingcasting
									//ClassCastException
		
	}

}