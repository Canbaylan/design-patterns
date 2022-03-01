public class IPad extends Tablet{
    public IPad(String mod, String mark)
    {
        super(mod,mark);
    }
    @Override
    public void accept(IVisitor visitor) {
        visitor.Visit(this);
    }
}
