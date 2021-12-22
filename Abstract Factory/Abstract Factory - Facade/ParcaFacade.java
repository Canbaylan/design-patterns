public class ParcaFacade {
    private Abstract abs;
    private Kaporta kap;
    private Tekerlek tek;


    public ParcaFacade(Abstract _abstract)
    {
        this.abs= _abstract;
        this.kap = abs.getKaporta();
        this.tek = abs.getTekerlek();

    }
    public String CreateKaporta()
    {
      return   kap.kaporta();
    }
    public String CreateTekerlek()
    {
      return   tek.tekerlek();
    }
}
