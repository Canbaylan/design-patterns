public class RezervasyonFacade {
    public void otelRezevasyonuYap(String otelAdi){
        Otel otel = new Otel();
        otel.otelRezervasyonu(otelAdi);
    }

    public void ucusRezervasyonuYap(String nereden, String nereye){
        Ucus ucus = new Ucus();
        ucus.ucusRezervasyon(nereden, nereye);
    }

    public void taksiCagir(String adres){
        Taksi taksi = new Taksi();
        taksi.taksiCagir(adres);
    }

    public void rezervasyonYap(String nereden, String nereye, String adres, String otelAdi){
        taksiCagir(adres);
        ucusRezervasyonuYap(nereden, nereye);
        otelRezevasyonuYap(otelAdi);
    }
}
