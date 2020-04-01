package command;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Action {
    private final HashMap<String, Command> commands = new HashMap<>();
    private final List<Command> undoCommands = new LinkedList<>();
    private final List<Command> redoCommands = new LinkedList<>();
    private int numberOfDeletedCommands = 0;

    public void register(String commandName, Command command){
        commands.put(commandName, command);
    }

    public void execute(String commandName){
        Command command = commands.get(commandName);
        command.execute();
        undoCommands.add(command);
        redoCommands.add(command);
    }

    public void undo(){
        if (undoCommands.size() > 0){
            undoCommands.remove(undoCommands.size() - 1).undo();
            ++numberOfDeletedCommands;
        }
    }

    public void redo(){
        if (numberOfDeletedCommands > 0){
            redoCommands.get(redoCommands.size() - 1 - numberOfDeletedCommands).execute();
        } else if (redoCommands.size() > 0){
            redoCommands.get(redoCommands.size() - 1).execute();
        }
    }
}
