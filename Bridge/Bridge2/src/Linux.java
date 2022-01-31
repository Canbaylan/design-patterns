public class Linux  extends  OS{
    public Linux(Mod mod)
    {
        super(mod);
    }
    @Override
    void OperatingSystem() {
        System.out.println("Linux os");
        get_mod().mod();
    }
}
