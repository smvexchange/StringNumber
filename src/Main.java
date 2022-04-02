public class Main {

    public static void main(String[] args) {
        String mess = "абвгдежзиклмнопрстуфхчшщьъэюя";
        int[] messInt = new int[mess.length()];
        show(mess, messInt);
        for (int i = 0; i < messInt.length; i++) {
            System.out.println(messInt[i]);
        }
    }

    public static int[] show(String mess, int[] messInt) {
        for (int i = 0; i < mess.length(); i++) {
            messInt[i] = (int) mess.charAt(i);
        }
        return messInt;
    }
}
