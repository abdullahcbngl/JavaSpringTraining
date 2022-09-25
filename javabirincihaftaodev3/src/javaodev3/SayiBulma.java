package javaodev3;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1, 2, 5, 7, 9, 0};
		int aranacak = 11;
		boolean varMi = false;
	
		
		for(int i = 0; i<sayilar.length; i++) {
			if(sayilar[i] == aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayý mevcuttur.");
		}
		else
			System.out.println("Sayý mevcut deðildir.");
	}

}
