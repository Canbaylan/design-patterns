public class RedoCommand implements ICommand{
    @Override
    public void Execute() {
        System.out.println("Redo command worked.");
    }
}
