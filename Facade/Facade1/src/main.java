public class main {
    public static void main(String[] args) {
        RezervasyonFacade facade = new RezervasyonFacade();

        //facade.otelRezevasyonuYap("Karadeniz Teknik Oteli");
        //facade.taksiCagir("Gülhane Parkı");
        //facade.ucusRezervasyonuYap("Erzincan", "Istanbul");

        facade.rezervasyonYap("Erzincan", "Istanbul", "Alibeykoy Otogar", "Baba Oteli");
    }
}
