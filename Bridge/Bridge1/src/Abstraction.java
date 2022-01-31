public class Abstraction {
    void uret(){}

    private Sekil _sekil;
    private Renk _renk;



    public Abstraction(Sekil sekil, Renk renk) {
        this._renk = renk;
        this._sekil = sekil;
    }

    public Sekil get_sekil() {
        return _sekil;
    }

    public void set_sekil(Sekil _sekil) {
        this._sekil = _sekil;
    }

    public Renk get_renk() {
        return _renk;
    }

    public void set_renk(Renk _renk) {
        this._renk = _renk;
    }
}
