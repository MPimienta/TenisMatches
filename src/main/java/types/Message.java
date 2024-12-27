package types;

public enum Message {

    INVALID_COMMAND,
    INPUT_COMMAND,
    NULL;

    public boolean isNull() {
        return this == Message.NULL;
    }

}
