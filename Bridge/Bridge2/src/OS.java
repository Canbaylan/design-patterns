public abstract class OS {
    abstract void OperatingSystem();

    public Mod get_mod() {
        return _mod;
    }

    public void set_mod(Mod _mod) {
        this._mod = _mod;
    }

    protected Mod _mod;
    //tek yapıcı metodda bağımlı iyelik ilişkisi yaratılmış olur
    // tek türde nesne oluşturulur. Yapıcı metodu zorlamış oluruz tek türe
    public OS(){}
    public OS(Mod mod)
    {
        this._mod = mod;
    }

}
