public abstract class ProductForSale {
  private String type;
  private double price;
  private String description;

  public ProductForSale(String type, double price, String description) {
    this.type = type;
    this.price = price;
    this.description = description;
  }

  public String getType() {
    return type;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public double getSalePrice(int quantity) {
    return (double) quantity * price;
  }

  public void pricedLineItem(int quantity) {
    System.out.printf("%d x %-18s %.2f \n", quantity, type, getSalePrice(quantity));
  }

  public abstract void showDetails();
}
