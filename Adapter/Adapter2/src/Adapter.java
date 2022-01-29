public class Adapter implements  ITutarHesaplayici{
    private Adaptee adaptee;
    public Adapter()
    {
        adaptee = new Adaptee();
    }
    @Override
    public double Hesapla(int miktar, double oran) {
        return adaptee.VadeliTutarHesapla(miktar,oran);
    }
}
