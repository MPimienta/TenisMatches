package views.console;

import types.Message;
import utils.Console;
import views.MessageView;

public class ConsoleMessageView extends MessageView {

    public void writeln(Message message) {
        if (!message.isNull()) {
            Console.getInstance().writeln(MessageView.MESSAGES[message.ordinal()]);
        }
    }
}
