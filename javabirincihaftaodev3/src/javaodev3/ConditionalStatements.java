package javaodev3;

public class ConditionalStatements {

	public static void main(String[] args) {
		int sayi = 14;
		if(sayi < 20) {
			System.out.println("Sayý 20 den küçüktür.");
		}
		else {
			System.out.println("Sayý 20 den küçük deðildir.");
		}
		
		int sayi2 = 12;
		if(sayi < 20) {
			System.out.println("Sayý 20 den küçüktür.");
		}
		else if(sayi == 20) {
			System.out.println("Sayý 20 ye eþittir.");
		}
		else {
			System.out.println("Sayý 20 den büyüktür.");
		}
		
	}

}
