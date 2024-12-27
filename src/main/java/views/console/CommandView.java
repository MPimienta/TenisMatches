package views.console;

import commands.Command;
import controllers.CommandController;
import types.Message;
import views.MessageView;

public class CommandView {
    private static final int COMMAND = 0;
    private static final int ARGUMENTS = 1;

    private final CommandController commandController;

    CommandView(CommandController commandController) {
        this.commandController = commandController;
    }

    void interact() {
        String[] input =  this.readCommand();
        Command command = this.getCommand(input);
        String arguments = this.getArguments(input);
        Message message = this.getCommandError(command);

        if (message.isNull()){
            this.execute(command, arguments);
        }
    }

    private String[] readCommand(){
        new ConsoleMessageView().writeln(Message.INPUT_COMMAND);
        return this.getInput();
    }

    private String[] getInput(){
        return new UserView().getInput().split(" ");
    }

    private Command getCommand(String[] input){
        return commandController.getCommand(input[COMMAND]);
    }

    private Message getCommandError(Command command) {
        Message error = this.commandController.getCommandError(command);
        new ConsoleMessageView().writeln(error);
        return error;
    }

    private void execute(Command command, String arguments) {
        assert command != null && arguments != null;

        Message message = this.commandController.executeCommand(command, arguments);
        new ConsoleMessageView().writeln(message);
    }

    private String getArguments(String[] input){
        if(input.length > 1){
            return input[ARGUMENTS];
        } else {
            return "";
        }
    }
}
