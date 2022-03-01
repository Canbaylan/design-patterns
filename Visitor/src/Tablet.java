public abstract class Tablet {
    public String model;
    public String marka;
    public Tablet(String mod,String mark)
    {
        this.marka= mark;
        this.model= mod;
    }
    public abstract void accept(IVisitor visitor);
}
