package controllers;

import commands.Command;
import commands.CommandManager;
import models.CLIApp;
import types.Message;

public class CommandController extends Controller{
    private final CommandManager commandManager;

    public CommandController(CLIApp cliApp){
        super(cliApp);
        this.commandManager = new CommandManager(cliApp);
    }

    public Message getCommandError(Command command){
        return this.commandManager.getCommandError(command);
    }

    public Message executeCommand(Command command, String arguments){
        return command.execute(arguments.split(";"));
    }

    public Command getCommand(String commandName){
        return this.commandManager.getCommand(commandName);
    }
}
