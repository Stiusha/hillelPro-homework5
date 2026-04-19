package app;

public class CalcCostBase implements CalcCost {

    @Override
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice();
    }
}
