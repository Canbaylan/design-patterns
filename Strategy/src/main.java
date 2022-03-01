public class main {
    public static void main(String[] args) {
        Eleman eleman = new Eleman(new DepartmanAIzınHesap(),new YoneticiMaasHesap());
        int yoneticiMaas = eleman.maasHesapla();
        int yoneticiIzın = eleman.izinHesapla();

        eleman = new Eleman(new DepartmanBIzınHesap(),new MuhendisMaasHesap());
        int muhendisMaas = eleman.maasHesapla();
        int muhendisIzın = eleman.izinHesapla();

        System.out.println("Muhendis(Maas/Izin): "+muhendisMaas + "TL  | " + muhendisIzın+" gün" );
        System.out.println("Yonetici(Maas/Izin): "+yoneticiMaas + "TL  | " +yoneticiIzın+" gün" );
    }
}
