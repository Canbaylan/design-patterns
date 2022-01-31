public class Windows extends OS{
    public Windows(Mod mod)
    {
        super(mod);
    }
    @Override
    void OperatingSystem() {
        System.out.println("Windows os");
        get_mod().mod();
    }
}
