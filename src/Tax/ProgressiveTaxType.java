package Tax;

public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        if (amount > 100000.0) {
            return amount * 0.10;
        } else if (amount < 100000.0) {
            return amount * 0.15;
        }
        return amount;
    }
}