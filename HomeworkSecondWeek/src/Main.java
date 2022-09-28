
public class Main {
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2; 
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		
		//value type
		int num1 = 10;
		int num2 = 20;
		num2 = num1;
		num1 = 30;
		System.out.println(num2);
		
		//reference type
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
		
		
		ReCapDemo_Classes process = new ReCapDemo_Classes();
		int result = process.sub(3, 4);
		System.out.println(result);
		
		
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setColor("Grey");
		
		System.out.println(product.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		System.out.println(product.getCode());
		
		Product product2 = new Product(2, "Laptop", "Lenovo", 4500, 1, "Black");
		System.out.println(product.getName());
		
		Product product3 = new Product(4, "Mobile Phone", "Apple", 19500, 2, "White");
		System.out.println(product.getName());
	}
}
