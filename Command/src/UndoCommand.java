public class UndoCommand implements ICommand{
    @Override
    public void Execute() {
        System.out.println("Undo command worked.");
    }
}
