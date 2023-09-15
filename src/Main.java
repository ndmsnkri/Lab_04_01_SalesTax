public class Main {
    public static void main(String[] args)
    {
        double purchasePrice = 100.00; // Replace with the actual purchase price
        final double AX_RATE = 0.05;   // 5% sales tax rate

        double salesTaxAmount = purchasePrice * TAX_RATE;

        System.out.println("Purchase Price: $" + purchasePrice);
        System.out.println("Sales Tax Amount (5%): $" + salesTaxAmount);

    }
}