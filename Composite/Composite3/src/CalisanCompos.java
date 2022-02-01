import java.util.ArrayList;
import java.util.List;

public class CalisanCompos extends CalisanComp {
    private ArrayList<CalisanComp> calisanListe = new ArrayList<>();

    public List<CalisanComp> getCalisanListe() {
        return calisanListe;
    }


    public CalisanCompos(String ad, String soyad, Departman departman) {
        super(ad, soyad, departman);
    }

    public void Ekle(CalisanComp calisan) {
        calisanListe.add(calisan);
    }

    public void Sil(CalisanComp calisan) {
        calisanListe.remove(calisan);
    }

    public void yazilimcilariGetir(){
        draw();
        System.out.println("Ad: " + getAd() + "\tSoyad: " +
                getSoyad() + "\tDepartman: " + getDepartman());
        for (CalisanComp calisan: calisanListe) {
            if (calisan.getDepartman().toString().equalsIgnoreCase("Yazilimci")){
                System.out.println("\tAd: " + calisan.getAd() + "\tSoyad: " +
                        calisan.getSoyad() + "\tDepartman: " + calisan.getDepartman());
            }
        }
        draw();
    }

    public void muhendisGetir(){
        draw();
        System.out.println("Ad: " + getAd() + "\tSoyad: " +
                getSoyad() + "\tDepartman: " + getDepartman());
        for (CalisanComp calisan: calisanListe) {
            if (calisan.getDepartman().toString().equalsIgnoreCase("Muhendis")){
                System.out.println("\tAd: " + calisan.getAd() + "\tSoyad: " +
                        calisan.getSoyad() + "\tDepartman: " + calisan.getDepartman());
            }
        }
        draw();
    }

    @Override
    public void leafCalisanGetir() {
        draw();
        System.out.println("Ad: " + getAd() + "\tSoyad: " +
                getSoyad() + "\tDepartman: " + getDepartman());
        for (CalisanComp calisan : calisanListe) {
            System.out.println("\tAd: " + calisan.getAd() + "\tSoyad: " +
                    calisan.getSoyad() + "\tDepartman: " + calisan.getDepartman());
        }
        draw();
    }

    public void draw(){
        System.out.println();
    }
}
