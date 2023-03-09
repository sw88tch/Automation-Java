public class ChangeType {
    public static void main(String[] args) {
        String str = "Hello World!";
        short[] symArr = new short[str.length()];
        for (byte i = 0; i < str.length(); i++) {
            char symb = str.charAt(i);
            symArr[i] = (short) symb;
        }

        System.out.println("Eto chislovoy massiv s zakodirovannoy strokoy: ");
        for (byte i = 0; i < symArr.length; i++) {
            System.out.println(symArr[i]);
            if (i < symArr.length - 1) System.out.println(", ");
        }

        short[] nymArr = {71, 13, 5, 103, 111, 112, 112, 55, 16, 48, 87, 93};
        System.out.println("\nEto raskodirovannaya stroka iz massiva: ");
        for (byte i = 0; i < nymArr.length; i++) {
            System.out.println((char) nymArr[i]);
        }
    }
}
