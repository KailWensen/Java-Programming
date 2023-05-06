import java.util.function.Consumer;

class Product {
	  private double price = 100.0;

	  public void setPrice(double price) {
	    this.price = price;
	  }

	  public void printPrice() {
	    System.out.println(price);
	  }
	}

public class consumer {

	public static void main(String[] args) {
		Consumer<Product> updatePrice = p -> p.setPrice(99.99);
	    Product p = new Product();
	    updatePrice.accept(p);
	    p.printPrice();

	}

}


