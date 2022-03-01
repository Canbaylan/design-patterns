public class main {
    public static void main(String[] args) {
        IPad ipad = new IPad("Ipad Mini","Apple");
        GalaxyTab galaxy = new GalaxyTab("Galaxy Tab","Samsung");

        ipad.accept(new WifiVisitor());
        galaxy.accept(new WifiVisitor());

        ipad.accept(new ThreeGVisitor());
        galaxy.accept(new ThreeGVisitor());
    }
}
