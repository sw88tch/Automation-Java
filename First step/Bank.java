public class Bank {
    public static void main(String[] args) {
        CashBox cashbox = new CashBox((short) 1101);
        String[] electronicQueue = new String[] {
                "N1",
                "N2",
                "N3",
                "N4",
                "N5",
                "N6"
        };

        for (int i = 0; i < electronicQueue.length; i++) {
            increaseTicketNumber(cashbox);
            System.out.println("Klient " + electronicQueue[i] + ", talon nomer: " + cashbox.ticketNumber + ", podoydite k kasse");
        }
    }

    public static void  increaseTicketNumber(CashBox cashbox) {
        cashbox.ticketNumber = increase(cashbox.ticketNumber, (byte) 1);
    }

    public static short increase(short numberToIncrease, byte increaser) {
        return numberToIncrease = (short) (numberToIncrease + increaser);
    }
}

class CashBox {
    public CashBox(short initialNumber) {
        ticketNumber = initialNumber;
        }

        short ticketNumber;
    }
