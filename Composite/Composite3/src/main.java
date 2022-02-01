public class main {
    public static void main(String[] args) {

        CalisanCompos Can = new CalisanCompos("Can","Baylan",Departman.Muhendis);

        CalisanComp Merve = new LeafCalisan("Merve","Yilmaz",Departman.Yazilimci);
        CalisanComp Hasan = new LeafCalisan("Hasan","Kadi",Departman.Veritabani_Yoneticisi);
        CalisanComp Damla = new LeafCalisan("Damla","Buyuk",Departman.Yazilimci);
        CalisanComp Baris = new LeafCalisan("Baris","Seker",Departman.Insan_kaynaklari);

        Can.Ekle(Merve); Can.Ekle(Baris); Can.Ekle(Damla);
        Can.leafCalisanGetir();
        Can.muhendisGetir();
        Can.yazilimcilariGetir();
        Can.Sil(Damla);
        Can.yazilimcilariGetir();

    }

    /*public enum Departman {
        Yonetici,
        Yazilimci,
        Veritabani_Yoneticisi,
        Muhendis,
        Insan_kaynaklari
    }*/
}

