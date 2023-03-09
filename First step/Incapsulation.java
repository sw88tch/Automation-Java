public class Incapsulation {
    public static void main(String[] args) {
        MelonStorage melonStorage = new MelonStorage(300);
        System.out.println(melonStorage.getMelonAmount());
        melonStorage.reduceMelonAmount(100);
        System.out.println(melonStorage.getMelonAmount());
    }
}

class MelonStorage {
    private int melonAmount;
    public MelonStorage(int newMelonAmount) {
        melonAmount = newMelonAmount;
    }
    public void reduceMelonAmount(int amountToTake) {
        if (amountToTake > melonAmount) {
            int difference = amountToTake - melonAmount;
            System.out.println("Ne udalos' vyvezti: " + difference);
            melonAmount = 0;
        } else {
            melonAmount = melonAmount - amountToTake;
        }
    }

    public int getMelonAmount() {
        return melonAmount;
    }
}