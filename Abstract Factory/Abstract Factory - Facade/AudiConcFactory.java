public class AudiConcFactory extends Abstract{
    @Override
    Tekerlek getTekerlek() {
        return new AudiTek();
    }

    @Override
    Kaporta getKaporta() {
        return new Audikap();
    }
}
