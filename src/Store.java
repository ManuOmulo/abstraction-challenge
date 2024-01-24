import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product){};

public class Store {
  public static void main(String[] args) {
    var beef = new Meat("Beef", 600, "Cow meat at Ksh 600 per kg");
    var tomato = new Grocery("Tomato", 50, "Organic tomatoes");
    var pork = new Meat("Pork", 450, "Halal pork at Ksh 450 per kg");

    ArrayList<ProductForSale> products = new ArrayList<>();
    products.add(beef);
    products.add(tomato);
    products.add(pork);

    ArrayList<OrderItem> order1 = new ArrayList<>();
    order1.add(new OrderItem(10, tomato));
    order1.add(new OrderItem(3, beef));
  }
}
