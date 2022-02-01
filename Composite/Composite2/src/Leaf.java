public class Leaf extends Component{
    public Leaf(String item) {
        super(item);
    }

    @Override
    public void Goster() {
        System.out.println("İtem -> " + item );
    }
}
