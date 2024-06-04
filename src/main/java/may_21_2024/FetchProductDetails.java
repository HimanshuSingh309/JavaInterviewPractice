package may_21_2024;

public class FetchProductDetails {

	public static void main(String[] args) {
		// now accessing the product details via public layer(methods)
		product p = new product("AMZ123456", "Mackbook Pro", 79999, 12);
		System.out.println("Product name is: " + p.getProductName());
		System.out.println("Product ID is: " + p.getProductId());
		System.out.println("Product price is: " + p.getPrice());
		System.out.println("Product quantity is: " + p.getStockQuantity());
		
		// updating the product price
		
		p.updatePrice(89999);
		System.out.println("Latest product price is: " + p.getPrice());
		
		// updating the product quantity
		
		p.reduceStock(3);
		System.out.println("Latest product quantity is: " + p.getStockQuantity());
		
		 // Now trying add invalid operations
        p.updatePrice(-50.0);
        p.updateStock(-50);
        p.reduceStock(1000);
		

	}

}
