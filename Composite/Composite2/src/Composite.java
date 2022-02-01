import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    protected List<Component> liste;
    public Composite(String item) {
        super(item);
        liste = new ArrayList<Component>();
    }

    public void ekle(Component comp)
    {
        liste.add(comp);
    }
    public void sil(Component comp)
    {
        liste.remove(comp);
    }
    public void get(Component comp)
    {
        System.out.println(comp);
    }
    @Override
    public void Goster() {
        System.out.println("item -> " + item);
        for (Component comp:liste) {
            comp.Goster();
        }
    }
}
