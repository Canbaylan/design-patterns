public abstract class CalisanComp {
    private String ad;
    private String soyad;
    private Departman departman;

    public CalisanComp(String ad, String soyad, Departman departman) {
        this.ad = ad;
        this.soyad = soyad;
        this.departman = departman;
    }
    public abstract void leafCalisanGetir();

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Departman getDepartman() {
        return departman;
    }

    public void setDepartman(Departman departman) {
        this.departman = departman;
    }
}
