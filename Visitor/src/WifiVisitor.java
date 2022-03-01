public class WifiVisitor implements IVisitor{
    @Override
    public void Visit(Tablet tablet) {
        if(tablet.getClass() == IPad.class)
            System.out.println("IPad wifi acildi.");
        else if(tablet.getClass() == GalaxyTab.class)
            System.out.println("GalaxyTab wifi acilamadi.");
        else
            System.out.println("Tablet degil");

    }
}
