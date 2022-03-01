public class Soket {
    int Port;
    private ISoketState _State;

    public Soket(int port)
    {
        this.Port = port;
        _State = new SoketStateAc();
    }
    public void Do()
    {
        _State.Handle(this);
    }

    public int getPort() {
        return Port;
    }

    public void setPort(int port) {
        Port = port;
    }

    public ISoketState get_State() {
        return _State;
    }

    public void set_State(ISoketState _State) {
        this._State = _State;
    }
}
