public class SoketStateKapat implements ISoketState{
    @Override
    public void Handle(Soket s) {
        System.out.println(s.getPort() + " soket kapatildi.");
        s.set_State(new SoketStateAc());
    }
}
