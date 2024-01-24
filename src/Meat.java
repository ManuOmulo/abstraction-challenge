public class Meat extends ProductForSale {

  public Meat(String type, double price, String description) {
    super(type, price, description);
  }

  @Override
  public void showDetails() {
    System.out.printf("%s - %s @ %.2f/kg\n", getType(), getDescription(), getPrice());
  }
}
