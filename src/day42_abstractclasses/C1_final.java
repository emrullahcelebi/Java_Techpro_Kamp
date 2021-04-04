package day42_abstractclasses;

public class C1_final {

	final static int SAYI = 10;
	//instance bir variable i final ve static yaparsaniz java onu bold yapar 
	//biz de ismi BUYUK HARFLE yazariz
	String isim;
		//Instance variable lara ilk deger atamasi yapmak zorunda degiliz
		//deger atamasak java turune gore default bir degere atar
	
	//final String soyisim;
	//final variable lar degeri sonradan degistirilemeyecegi icin ilk atama yapilmadan 
	//olusturulmasina izin vermez
	public static void main(String[] args) {
		System.out.println(SAYI);

		
		System.out.println(Integer.MAX_VALUE);
		
	}
	public void deneme() {
		System.out.println("deneme yapiyoruz");
	}

	public final void deneme2() {
		System.out.println("deneme yapiyoruz 2");
	}
}