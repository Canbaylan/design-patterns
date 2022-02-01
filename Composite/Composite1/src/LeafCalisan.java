public class LeafCalisan extends Calisan{
    public LeafCalisan(String ad, enPozisyon pozisyon) {
        super(ad, pozisyon);
    }

    @Override
    public void Goster() {
        System.out.println("Pozisyon : "+ pozisyon.toString() + " Ad: "+ad);
    }
}
