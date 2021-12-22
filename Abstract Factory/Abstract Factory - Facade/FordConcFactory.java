public class FordConcFactory extends Abstract{
    @Override
    Tekerlek getTekerlek() {
        return new FordTek();
    }

    @Override
    Kaporta getKaporta() {
        return new FordKap();
    }
}
