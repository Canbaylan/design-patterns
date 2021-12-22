public class TelefonBayisi {
    public static void main(String[] args) {
        // Bayi'ler fabrikaları ve interface'leri bilecek
        // Metodlar static olmadığından sınıfları oluşturmamız gerekiyor.

        S8Factory s8factory = new S8Factory();
        Telefon s8 = s8factory.getTelefon("s8","2600",4,8);

        Note8Factory note8factory = new Note8Factory();
        Telefon note8 = note8factory.getTelefon("Note8","3000",5,10);
        System.out.println(s8);
        System.out.println(note8);
    }
}
