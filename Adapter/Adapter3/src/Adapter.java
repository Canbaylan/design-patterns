public class Adapter extends Target {
    private Adaptee _adaptee = new Adaptee();
    @Override
    public void  Siparis(){
        _adaptee.bateriSiparis();
    }
}
