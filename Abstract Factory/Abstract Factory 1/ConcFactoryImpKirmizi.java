public class ConcFactoryImpKirmizi implements AbstractFactory{
    @Override
    public Elma getElma() {
        return new KirmiziElma();
    }

    @Override
    public Biber getBiber() {
        return new KirmiziBiber();
    }
}
