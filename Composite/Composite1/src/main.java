public class main {
    public static void main(String[] args) {
        CompositeCalisan ykBaskani = new CompositeCalisan("Birol",enPozisyon.GenelMudur);
        CompositeCalisan genelMudur = new CompositeCalisan("Can",enPozisyon.Mudur);
        CompositeCalisan mudur = new CompositeCalisan("Gulay",enPozisyon.Mudur);
        mudur.ekle(new LeafCalisan("mehmet",enPozisyon.DepartmanSorumlusu));
        mudur.ekle(new LeafCalisan("Sema",enPozisyon.Isci));
        genelMudur.ekle(mudur);
        ykBaskani.ekle(genelMudur);
        genelMudur.Goster();
        System.out.println("Yk baskani");
        ykBaskani.Goster();


    }
}
