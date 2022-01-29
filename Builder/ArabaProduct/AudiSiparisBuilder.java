public class AudiSiparisBuilder extends SiparisBuilder{
    public AudiSiparisBuilder(){}
    @Override
    public void setMarka(String marka) {
        getAraba().setMarka(new Marka(marka));
    }

    @Override
    public void setModel(String model) {
        getAraba().setModel(new Model(model));
    }
}
