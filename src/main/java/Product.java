public class Product implements ICalculationPrice {
    private String name;
    private int quantity;
    private double price;
    private boolean isExpensive;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isExpensive() {
        return isExpensive;
    }

    public void setExpensive(boolean expensive) {
        isExpensive = expensive;
    }

    @Override
    public double getCommonPrice(int quantity, double price) {
        return quantity*price;
    }

    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", quantity=" + quantity +
               ", price=" + price +
               ", isExpensive=" + isExpensive +
               "}\n";
    }
}
