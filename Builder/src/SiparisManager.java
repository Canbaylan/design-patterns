public class SiparisManager {
    private SiparisBuilder builder;
    public Araba createOrder(String marka,String model)
    {
        if(marka.equals("Audi"))
        {
            builder = new AudiSiparisBuilder();
        }
        else if(marka.equals("Bmw"))
        {
            builder = new BmwSiparisBuilder();
        }
        this.builder.setMarka(marka);
        this.builder.setModel(model);
        return this.builder.getAraba();
    }
    public void printOrder(){
        System.out.println("Marka : "+ this.builder.getAraba().getMarka());
        System.out.println("Model : "+ this.builder.getAraba().getModel());
    }
}
