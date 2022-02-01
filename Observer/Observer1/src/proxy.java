package Uygulama1;

import java.util.ArrayList;
import java.util.List;

public class proxy implements subject{

    List<Observer> obsListe;
    public proxy(){this.obsListe = new ArrayList<Observer>();}


    private String ad;
    private int fiyat;
    private Boolean degistiMi=false;
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
        degistiMi = true;

    }




    @Override
    public void register(Observer ob) {
        obsListe.add(ob);
    }

    @Override
    public void deregister(Observer ob) {
        obsListe.remove(ob);
    }

    @Override
    public void notifyObservers() {
    if(degistiMi)
    {
        for(Observer item : obsListe)
        {
            item.update();
        }
        degistiMi = false;
    }

    }
}
