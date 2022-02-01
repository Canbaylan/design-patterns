public abstract class Calisan {
    protected String ad;
    protected enPozisyon pozisyon;
    public Calisan(String ad, enPozisyon pozisyon)
    {
        this.ad = ad;
        this.pozisyon = pozisyon;
    }
    public abstract void Goster();
}
