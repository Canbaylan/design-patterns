public class main {
    public static void main(String[] args) {
        Target bat = new Adapter();
        bat.Siparis();
        System.out.println("---");
        Target git = new Gitar();
        git.Siparis();
    }
}
