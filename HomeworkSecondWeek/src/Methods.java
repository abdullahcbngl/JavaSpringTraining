
public class Methods {
	void message() {
		
	}
	public static void main(String[] args) {
		findNum();
	
		
	}
	//camelCase
	public static void findNum() {
		int[] numbers = new int[] {1,2,5,7,9,0};
		
		int desiredNumber = 6;
		boolean isThere = false;
		
		for(int number : numbers) {
			if(number == desiredNumber) {
				isThere = true;
				break;
			}
		}
		String message;
		if(isThere) {
			message = "Number is available: " + desiredNumber;
			giveMessage(message);
		}
		else {
			message = "Number is not available: " + desiredNumber;
			giveMessage(message);
		}
		
	}
	
	public static void giveMessage(String message) {
		System.out.println(message);
	}
}
