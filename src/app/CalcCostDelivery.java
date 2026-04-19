package app;

public class CalcCostDelivery implements CalcCost {

    private final static double DELIVERY_PRICE = 7;
    private final CalcCost calcCost;

    public CalcCostDelivery(CalcCost calcCostBase) {
        this.calcCost = calcCostBase;
    }

    @Override
    public double calcCost(Product product) {
        return calcCost.calcCost(product) + DELIVERY_PRICE;
    }
}

