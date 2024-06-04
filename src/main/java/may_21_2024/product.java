package may_21_2024;

public class product {

	// create a Product class that encapsulates the details of a product, such as
	// the product ID, name, price, and stock quantity.
	private String productId;
	private String productName;
	private double price;
	private int stockQuantity;

	public product(String productId, String productName, double price, int stockQuantity) {
		// this.global = local;
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.stockQuantity = stockQuantity;

	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	// public method to update the price

	public void updatePrice(double newPrice) {
		if (newPrice > 0) {
			this.price = newPrice;
			System.out.println("price updated. " + newPrice);
		} else
			System.out.println("Invalid price.");

	}

	// public method to add the product stock
	public void updateStock(int quanity) {
		if (quanity > 0) {
			this.stockQuantity += quanity;
			System.out.println("Stock updated.");
		} else
			System.out.println("Inavlid stock quanity while adding.");
	}

	// public method to reduce the stock
	public void reduceStock(int quanity) {
		if (quanity <= stockQuantity) {
			this.stockQuantity -= quanity;
			System.out.println("Stock quantity reduced.");
		} else
			System.out.println("Inavlid stock quanity while reducing.");
	}

}
