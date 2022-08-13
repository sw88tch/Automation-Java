public class Zadacha1 {
    public static void main(String[] args) {
        int streetsNumber = 7;
        int housesNumber = 4;
        for (int i = 1; i <= streetsNumber; i += 1) {
            for (int j = 1; j <= housesNumber; j += 1) {
                System.out.println("Ylica " + i + " Dom " + j + "- Podarok polychen.");
            }
        }
    }
}
