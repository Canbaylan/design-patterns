import java.util.Stack;

public class Invoker {
    private Stack<ICommand> commandList = new Stack<ICommand>();
    public void executeAll()
    {
        while(commandList.size()>0)
            commandList.pop().Execute();
    }
    public void addCommand(ICommand command)
    {
        commandList.push(command);
    }
}
