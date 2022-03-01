public class main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.addCommand(new UndoCommand());
        invoker.addCommand(new RedoCommand());
        invoker.addCommand(new UndoCommand());
        invoker.executeAll();
    }
}
