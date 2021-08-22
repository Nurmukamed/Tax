package Tax;

public class Test {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        IncomeTaxType incomeTaxType = new IncomeTaxType();
        VATaxType vaTaxType = new VATaxType();
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();

        Bill[] payments = new Bill[]{
                new Bill(10000, incomeTaxType, taxService),
                new Bill(1289000, vaTaxType, taxService),
                new Bill(25800, progressiveTaxType, taxService),
        };
        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}