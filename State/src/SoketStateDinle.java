public class SoketStateDinle implements ISoketState{
    @Override
    public void Handle(Soket s) {
        System.out.println(s.getPort() + " soket dinleniyor.");
        s.set_State(new SoketStateKapat());
    }
}
