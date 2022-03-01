public class Eleman {
    public IzınHesap izinHesap;
    public MaasHesap maasHesap;
    public Eleman(IzınHesap _izinHesap, MaasHesap _maasHesap)
    {
        this.izinHesap = _izinHesap;
        this.maasHesap = _maasHesap;
    }
    public int maasHesapla()
    {
        return maasHesap.maasHesap();
    }
    public int izinHesapla()
    {
        return izinHesap.izinHesapla();
    }
}
