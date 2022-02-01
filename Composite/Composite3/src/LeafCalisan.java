public class LeafCalisan extends CalisanComp {
    public LeafCalisan(String ad, String soyad, Departman departman) {
        super(ad, soyad, departman);
    }

    @Override
    public void leafCalisanGetir() {
        System.out.println("Ad: " + getAd() + "\tSoyad: " +
                getSoyad() + "\tDepartman: " + getDepartman());
    }
}
