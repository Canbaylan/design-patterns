package Uygulama1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObserver1 implements Observer{

    List<subject> musteriListe = new ArrayList<subject>();
    @Override
    public void update() {
        System.out.println("Fiyat degisti.");
    }
}
