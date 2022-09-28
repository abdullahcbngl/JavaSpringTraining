
public class Methods2 {

	public static void main(String[] args) {
		String message = "Today weather is so good"; 
		String newMessage = message.substring(0,2);
		System.out.println(newMessage);
		int total2 = sum(2,5);
		System.out.println(total2);
		
		int total3 = sum2(3,5,3,15,23);
		System.out.println(total3);
	}
	public static void add() {
		System.out.println("Added");
	}
	
	public static void delete() {
		System.out.println("Deleted");
	}	
	
	public static void update() {
		System.out.println("Updated");
	}
	
	public static int sum(int num1, int num2) {
		int total = num1 + num2;
		return total;
	}
	
	public static int sum2(int... numbers) {
		int total = 0;
		for(int num : numbers) {
			total += num;
		}
		
		return total;
	}
}
