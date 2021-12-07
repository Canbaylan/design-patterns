public class TelefonFabrikası {
    public static Telefon getTelefon(String model, String batarya,
                                     int en, int boy){
        Telefon telefon;
        if("s8".equalsIgnoreCase(model)){
            telefon = new S8(model,batarya,en,boy);
         }
        else if("Note8".equalsIgnoreCase(model))
        {
            telefon = new Note8(model,batarya,en,boy);
        }
        else {
            throw new RuntimeException("Gecerli bir model degildir");
        }
    return telefon;
    }
}
