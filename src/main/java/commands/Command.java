package commands;

import types.Message;

public interface Command {
    Message execute(String[] arguments);
}