public abstract class PlayerHandler {
    protected PlayerHandler _sonrakiHandler;
    public PlayerHandler sonrakiHandle(PlayerHandler sonraki)
    {
        this._sonrakiHandler=sonraki;
        return this;
    }
    public abstract void play(String filePath);
}
