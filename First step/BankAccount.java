public class BankAccount {
    public static void main(String[] args) {
        String[] currency = {"USD", "EUR", "RUB"};
        Bills bills = new Bills();
        bills.moneyUSD = 0.0;
        bills.moneyEUR = 0.0;
        bills.moneyRUB = 0.0;

        System.out.println("Otkrytye scheta: ");
        if (bills.moneyUSD != null) {
            System.out.println("- " + currency[0]);
        }
        if (bills.moneyEUR != null) {
            System.out.println("- " + currency[1]);
        }
        if (bills.moneyRUB != null) {
            System.out.println("- " + currency[2]);
        }
    }
}

class Bills {
    Double moneyUSD;
    Double moneyEUR;
    Double moneyRUB;
        }