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
    printProductList(products);

    ArrayList<OrderItem> order1 = new ArrayList<>();
    addItem(order1, beef, 3);
    addItem(order1, tomato, 10);
    printReceipt(order1);

  }

  public static void addItem(ArrayList<OrderItem> list, ProductForSale item, int quantity) {
    list.add(new OrderItem(quantity, item));
  }

  public static void printReceipt(ArrayList<OrderItem> list) {
    double total = 0;
    System.out.println("---------- Receipt -----------");
    for (OrderItem item : list) {
      double itemCost = item.product().getSalePrice(item.quantity());
      item.product().pricedLineItem(item.quantity());
      total += itemCost;
    }
    System.out.println("_".repeat(30));
    System.out.printf("%-18s Ksh %.2f \n", "Total", total);
    System.out.println("_".repeat(30));
  }

  public static void printProductList(ArrayList<ProductForSale> products) {
    System.out.println("STORE PRODUCTS");
    for (ProductForSale product : products) {
      System.out.printf("%s - %s \n", product.getType(), product.getDescription());
    }
    System.out.println();
  }
}
