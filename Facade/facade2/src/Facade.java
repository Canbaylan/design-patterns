public class Facade {
    TcKimlikSistem TCSistem = new TcKimlikSistem();
    Sistem1Kontrol sistem1Kontrol = new Sistem1Kontrol();
    Sistem2Operations sistem2Operations = new Sistem2Operations();

    public void UyeEkle(String tc)
    {
        if(TCSistem.kontrol(tc) && !sistem1Kontrol.KaraListe(tc))
            sistem2Operations.UyeEkle(tc);
        else
            System.out.println("Uye eklenemedi. -> "+tc);
    }
}
