public class Client {
    public static void main(String[] args) {
        AbstractFactory factoryKirmizi = new ConcFactoryImpKirmizi();
        AbstractFactory factoryYesil = new ConcFactoryImpYesil();

        Elma kirmiziElma = factoryKirmizi.getElma();
        Biber kirmiziBiber = factoryKirmizi.getBiber();

        Elma yesilElma = factoryYesil.getElma();
        Biber yesilBiber = factoryYesil.getBiber();

        System.out.println("Aile 1");
        System.out.println(kirmiziElma.getType());
        System.out.println(kirmiziBiber.getType());
        System.out.println("---------------");
        System.out.println("Aile 2");
        System.out.println(yesilBiber.getType());
        System.out.println(yesilElma.getType());

    }
}
