public class Kagit extends Abstraction{
    public Kagit(Sekil sekil,Renk renk)
    {
        super(sekil,renk);
    }
    @Override
    void uret() {
        System.out.println("Uretilen : "+"Kagittan");
        System.out.println(get_renk().Renk());
        System.out.println(get_sekil().getSekil());

    }
}
