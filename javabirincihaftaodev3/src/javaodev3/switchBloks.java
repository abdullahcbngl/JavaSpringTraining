package javaodev3;

public class switchBloks {

	public static void main(String[] args) {
		/*
		 * switch(condition){ case 1 : .....;break; case 2 : .....;break; default :
		 * .....;break;}
		 */
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("M�kemmel : Ge�tiniz");
			break;

		case 'B':
			System.out.println("�ok g�zel : Ge�tiniz");
			break;

		case 'C':
			System.out.println("�yi : Ge�tiniz");
			break;

		case 'D':
			System.out.println("Fena de�il : Ge�tiniz");
			break;

		case 'F':
			System.out.println("Maalesef : Kald�n�z");
			break;

		default:
			System.out.println("Ge�ersiz bir not girdiniz !!!");
		}

	}

}
