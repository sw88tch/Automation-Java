import java.util.Random;

public class Massiv1 {
    public static void main(String[] args){
        String[] appliances = { "Washer", "Dryer", "Frozen", "Microwave", "TV", "Mixer" };
        int[] amount = new int[6];
        Random random = new Random(); // генерируем случайное число
        for (int i = 0; i < appliances.length; i++) {
            amount[i] = random.nextInt(11);
        }
        for (int i = 0; i < appliances.length; i++) {
            System.out.println("Naimenovanie: " + appliances[i] + "; Kolichestvo: " + amount[i] + ";");
        }
    }
}
