package hometask1;

public enum Command {

    GREET("/greet", "Hello world!"),
    HELP("/help", null),
    EXIT("/exit", "shutting down..."),
    TEST("/test", "test"),
    OTHER("", "Cannot recognize a command. Please type '/help' to get the command list"),
    ;

    private final String commandText;
    private final String commandReply;

    Command(String commandText, String commandReply) {
        this.commandText = commandText;
        this.commandReply = commandReply;
    }

    public static Command fromText(String text) {
        Command[] commands = values();

        for (Command command : commands) {
            if (command.commandText.equals(text)) {
                return command;
            }
        }

        return OTHER;
    }

    public String getReply() {
        if (this == HELP) {
            StringBuilder reply = new StringBuilder();
            Command[] commands = values();
            for (Command command : commands) {
                reply.append(command.commandText).append(" ");
            }
            return reply.toString();
        }
        return commandReply;
    }

}
