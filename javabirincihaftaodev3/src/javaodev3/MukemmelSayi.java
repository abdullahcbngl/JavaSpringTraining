package javaodev3;

public class MukemmelSayi {

	public static void main(String[] args) {
		/*Kendinden baþka tüm pozitif tam bölenlerinin 
		toplamý kendisine eþit olan sayýlardýr.*/
		
		int number = 6;
		
		int total = 0;
		
		for(int i = 1; i<number; i++) {
			if(number % i == 0) {
				total += i;
			}
		}
		
		if(total == number) {
			System.out.println("Mükemmel sayýdýr.");
		}
		else {
			System.out.println("Mükemmel sayý deðildir.");
		}
		
	}

}
