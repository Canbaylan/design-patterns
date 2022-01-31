public class main {
    public static void main(String[] args) {
        OS uygulama = new Windows(new Light());
        uygulama.OperatingSystem();
        uygulama = new Linux(new Dark());
        System.out.println();
        uygulama.OperatingSystem();
    }
}
