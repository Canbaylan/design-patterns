public class GalaxyTab extends Tablet{
    public GalaxyTab(String mod, String mark)
    {
        super(mod,mark);
    }
    @Override
    public void accept(IVisitor visitor) {
        visitor.Visit(this);
    }
}
