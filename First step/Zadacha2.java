public class Zadacha2 {
    public static void main(String[] args) {
        int days = 30;
        int queue = 7;
        int appointment = 5;
        for (int i = 1; i <= days; i += 1) {
            System.out.println("Day " + i);
            if (i % 2 == 0) {
                for (int j = 1; j <= queue; j += 1) {
                    System.out.println("Queue " + j);
                }
            } else {
                for (int j = 1; j <= appointment; j += 1) {
                    System.out.println("Appointment " + j);
                }
            }
            System.out.println("Segodnya vseh vylrvhili!");
        }
        System.out.println("Kakoy mesyac!");
    }
}