package views;

import types.Message;

public abstract class MessageView {
    public static final String[] MESSAGES = {
            "\tInvalid input command",
            "\t>>>",
    };

    public abstract void writeln(Message message);
}
