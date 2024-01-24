public class Grocery extends ProductForSale {

  public Grocery(String type, double price, String description) {
    super(type, price, description);
  }

  @Override
  public void showDetails() {
    System.out.printf("%s - %s at %.2f each\n", getType(), getDescription(), getPrice());
  }
}
