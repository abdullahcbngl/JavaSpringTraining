package javaodev3;

public class ArkadasSayilar {

	public static void main(String[] args) {
		/*Kendileri hari� pozitif tam b�lenleri toplam� birbirine
		 * e�it olan say�lara arkada� say� denir.
		 */
		
		int num1 = 220;
		int num2 = 284;
		
		int total1 = 0;
		int total2 = 0;
		
		for(int i = 1; i<num1; i++) {
			if(num1 % i == 0) {
				total1 = total1 + i;
			}
		}
		
		for(int j = 1; j<num2; j++ ) {
			if(num2 % j == 0) {
				total2 = total2 +j;
			}
		}
		
		if(num1 == total2 && num2 == total1) {
			System.out.println("Bu say�lar arkada� say�lard�r.");
		}
		else {
			System.out.println("Arkada� say�lar de�ildir.");
		}
	
	}

}
