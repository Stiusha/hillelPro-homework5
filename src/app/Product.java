package app;

public class Product {
    private final String name;
    private final int quota;
    private final double price;

    public Product(String name, int quota, double price) {
        this.name = name;
        this.quota = quota;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuota() {
        return quota;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(
                "Product: %s, quota is %d %s, price is %s %s.",
                this.name,
                this.quota,
                Constants.MEASURE,
                Constants.CURRENCY,
                this.price
        );
    }
}
