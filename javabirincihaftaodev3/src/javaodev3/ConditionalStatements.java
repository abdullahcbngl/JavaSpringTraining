package javaodev3;

public class ConditionalStatements {

	public static void main(String[] args) {
		int sayi = 14;
		if(sayi < 20) {
			System.out.println("Say� 20 den k���kt�r.");
		}
		else {
			System.out.println("Say� 20 den k���k de�ildir.");
		}
		
		int sayi2 = 12;
		if(sayi < 20) {
			System.out.println("Say� 20 den k���kt�r.");
		}
		else if(sayi == 20) {
			System.out.println("Say� 20 ye e�ittir.");
		}
		else {
			System.out.println("Say� 20 den b�y�kt�r.");
		}
		
	}

}
