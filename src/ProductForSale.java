public abstract class ProductForSale {
  private String type;
  private double price;
  private String description;

  public ProductForSale(String type, double price, String description) {
    this.type = type;
    this.price = price;
    this.description = description;
  }

  public double getSalePrice(int quantity) {
    return (double) quantity * price;
  }

  public void pricedLineItem(int quantity) {
    System.out.printf("%s x %d ", type, quantity);
  }

  public abstract void showDetails();
}
