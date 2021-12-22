public class Note8Factory implements TelefonFactory{
    @Override
    public Telefon getTelefon(String model, String batarya, int en, int boy) {
        return new Note8(model,batarya,en,boy);
    }
}
