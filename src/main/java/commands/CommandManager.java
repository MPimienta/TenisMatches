package commands;

import models.CLIApp;
import types.Message;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private final Map<String, Command> commands;

    public CommandManager(CLIApp cliApp) {
        ExecutionController controller = new ExecutionController(cliApp);
        this.commands = new HashMap<>();

    }

    public Command getCommand(String input){
        return this.commands.get(input);
    }

    public Message getCommandError(Command command){
        if(command == null){
            return Message.INVALID_COMMAND;
        } else {
            return Message.NULL;
        }
    }
}
