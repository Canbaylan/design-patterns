public class TelefonBayi {
    public static void main(String[] args) {
        Telefon s8= TelefonFabrikası.getTelefon("s8","2600",
                4,8);
        Telefon note8= TelefonFabrikası.getTelefon("note8","2600",
                5,9);
        System.out.println("s8 icin telefon ozellikleri");
        System.out.println(s8);
        System.out.println();
        System.out.println("note8 icin telefon ozellikleri");
        System.out.println(note8);
    }
}
