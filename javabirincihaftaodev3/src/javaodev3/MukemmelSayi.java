package javaodev3;

public class MukemmelSayi {

	public static void main(String[] args) {
		/*Kendinden ba�ka t�m pozitif tam b�lenlerinin 
		toplam� kendisine e�it olan say�lard�r.*/
		
		int number = 6;
		
		int total = 0;
		
		for(int i = 1; i<number; i++) {
			if(number % i == 0) {
				total += i;
			}
		}
		
		if(total == number) {
			System.out.println("M�kemmel say�d�r.");
		}
		else {
			System.out.println("M�kemmel say� de�ildir.");
		}
		
	}

}
