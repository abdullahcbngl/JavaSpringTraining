package javaodev3;

public class StringDemo {

	public static void main(String[] args) {
		String mesaj = "		Bug�n hava �ok g�zel.		";
		System.out.println(mesaj);
	/*	
		System.out.println("Eleman say�s� : " + mesaj.length());
		System.out.println("5.Eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya�as�n!"));
		System.out.println(mesaj);
		
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("av"));*/
		String mesaj2 = mesaj.replace(' ', '-');
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj);
		
		System.out.println(mesaj.substring(2));
		
		//son indexteki de�eri almaz.
		System.out.println(mesaj.substring(2,12));
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());
	}

}
