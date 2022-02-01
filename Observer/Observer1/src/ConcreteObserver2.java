package Uygulama1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObserver2 implements Observer{
    List<subject> musterilist = new ArrayList<subject>();
    public void favEkle(subject sub)
    {
        musterilist.add(sub);
    }
    public void favCikar(subject sub)
    {
        musterilist.remove(sub);
    }
    @Override
    public void update() {
        System.out.println("Fiyat Degisti..");
    }
}
