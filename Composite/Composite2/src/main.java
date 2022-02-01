public class main {
    public static void main(String[] args) {
        Composite menu = new Composite("Menu");
        Composite menuitem1 = new Composite("Menu Item");
        Component menuitem11 = new Leaf("Menu item 1.1");
        Component menuitem12 = new Leaf("Menu item 1.2");

        menuitem1.ekle(menuitem11);
        menuitem1.ekle(menuitem12);

        menu.ekle(menuitem1);
        menu.Goster();
    }
}
