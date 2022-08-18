public class Massiv3 {
    public static void main(String[] args){
        String[] appliances = { "Washer", "Dryer", "Frozen", "Microwave", "TV", "Mixer" };
        String[] additionalAppliances = { "VacuumCleaner", "BathSupplies", "NewItem" };
        String[] newAppliances = new String[9];
        for (int i = 0; i < appliances.length; i++) {
            newAppliances[i] = appliances[i];
        }
        for (int i = 0; i < additionalAppliances.length; i++) {
            newAppliances[i + 6] = additionalAppliances[i];
        }
        for (int i = 0; i < newAppliances.length; i++) {
            System.out.println("Naimenovanie: " + newAppliances[i]);
        }
    }
}