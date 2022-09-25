package javaodev3;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'K';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalýn Sesli harftir.");
			break;
		default:
			System.out.println("Ýnce sesli harfdir.");
			break;

		}

	}

}
