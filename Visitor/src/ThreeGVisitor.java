public class ThreeGVisitor implements IVisitor{
    @Override
    public void Visit(Tablet tablet) {
        if(tablet.getClass() == IPad.class )
            System.out.println("IPad 3g acilamadi.");
        else if(tablet.getClass() == GalaxyTab.class)
            System.out.println("GalaxyTab 3g acildi.");
        else
            System.out.println("Tablet degil");

    }
}
