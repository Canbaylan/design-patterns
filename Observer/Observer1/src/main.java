package Uygulama1;

public class main {
    public static void main(String[] args) {

        proxy pr = new proxy();
        Observer ayakkabi = new ConcreteObserver2();
        ConcreteObserver2 giysi = new ConcreteObserver2();
        pr.register(ayakkabi);

        giysi.favEkle(pr);

        pr.setAd("Ayakkabi");
        pr.setFiyat(120);
        pr.notifyObservers();
        pr.notifyObservers();
        pr.setFiyat(140);
        pr.notifyObservers();

    }

}
