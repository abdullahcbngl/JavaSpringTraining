package javaodev3;

public class MiniProjeAsalSay� {

	public static void main(String[] args) {
		int number = -2;
		int remainder = number % 2;
			//System.out.println(remainder);
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Ge�ersiz say�!");
			return;
		}
		
		if(number < 2) {
			System.out.println("Ge�ersiz say�!");
			return;
		}
		for(int i = 2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false; 
			}
		
		}
		if(isPrime == true) {
			System.out.println(number + " say�s� asald�r.");
		}
		else {
			System.out.println(number + " say�s� asal de�ildir.");
		}
	}

}
