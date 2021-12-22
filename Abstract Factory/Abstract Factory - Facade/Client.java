public class Client {
    public static void main(String[] args) {

        //Facade
        /*ParcaFacade fac = new ParcaFacade(new AudiConcFactory());
        System.out.println(fac.CreateTekerlek());
        System.out.println(fac.CreateKaporta());*/

        AudiConcFactory auditek = new AudiConcFactory();
        Tekerlek audi =  auditek.getTekerlek();
        System.out.println(audi.tekerlek());
        Kaporta audikap= auditek.getKaporta();
        System.out.println(audikap.kaporta());
    }
}
