public class main {
    public static void main(String[] args) {
        SoyutFabrika sekilFactory = FabrikaYaratici.getFabrika("sekil");
        Sekil fener = sekilFactory.sekliGetir("daire");
        fener.ciz();

        SoyutFabrika renkFactory = FabrikaYaratici.getFabrika("renk");
        Renk renk = renkFactory.rengiGetir("sari");
        renk.doldur();
    }
}
