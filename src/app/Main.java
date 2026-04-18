package app;

public class Main {
    public static void main(String[] args) {
        String[] data = getData();

        Product product = new Product(data[0],
                Integer.parseInt(data[1]),
                Double.parseDouble(data[2]));

        CalcCost costBase = new CalcCostBase();
        calcCost(product, costBase);

        CalcCost costDelivery = new CalcCostDelivery(costBase);
        calcCost(product, costDelivery);
    }

    public static String[] getData() {
        return new String[]{"abc", "5", "2.5"};
    }

    public static void calcCost(Product product, CalcCost calcCost) {
        double baseCost = calcCost.calcCost(product);
        System.out.println(product);
        System.out.printf("Cost is %s %s.\n", Constants.CURRENCY, baseCost);
    }
}