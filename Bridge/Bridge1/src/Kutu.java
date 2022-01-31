public class Kutu extends Abstraction {
    public Kutu(Sekil sekil,Renk renk)
    {
        super(sekil,renk);
    }
    @Override
    void uret() {
        System.out.println("Uretilen : "+"Kutudan");
        System.out.println(get_renk().Renk());
        System.out.println(get_sekil().getSekil());

    }
}
