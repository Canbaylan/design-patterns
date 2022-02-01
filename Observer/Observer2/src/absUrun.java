import java.util.ArrayList;
import java.util.List;

public abstract class absUrun {
    public String urunAdi;
    private int fiyat;
    public List<IUye> takipList = new ArrayList<IUye>();
    public absUrun(String urunAd,int fiyati)
    {
        this.urunAdi = urunAd;
        this.fiyat = fiyati;
    }
    public void NotifyUrun()
    {
        for (IUye uye:takipList ) {
            uye.Update(this);
        }
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        if(fiyat < this.fiyat)
            NotifyUrun();
        this.fiyat = fiyat;
    }
}
