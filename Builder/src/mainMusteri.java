public class mainMusteri {
    public static void main(String[] args) {
        SiparisManager manager = new SiparisManager();

        manager.createOrder("Audi","Focus");
        manager.printOrder();
        manager.createOrder("Ford","Focus");
        manager.printOrder();
    }
}
