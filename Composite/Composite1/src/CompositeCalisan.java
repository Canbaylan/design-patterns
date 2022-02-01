import java.util.ArrayList;
import java.util.List;

public class CompositeCalisan extends Calisan{
    protected List<Calisan> Calisanlar;
    public CompositeCalisan(String ad, enPozisyon pozisyon) {
        super(ad, pozisyon);
        Calisanlar = new ArrayList<Calisan>();
    }

    @Override
    public void Goster() {
        System.out.println("CompPozisyon : "+ pozisyon.toString() + " Ad: "+ad);
        for (Calisan item:Calisanlar ) {
            item.Goster();
        }
    }

    public void ekle(Calisan calisan)
    {
        Calisanlar.add(calisan);
    }
}
