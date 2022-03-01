public class SoketStateAc implements ISoketState{
    @Override
    public void Handle(Soket s) {
        System.out.println(s.getPort() + " soketi acildi.");
        s.set_State(new SoketStateDinle());
    }
}
