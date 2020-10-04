package behavioral.command;

import java.util.List;
import java.util.stream.Collectors;

public class Cynologist {

    private List<Command> commands;

    public Cynologist() {
    }

    public Cynologist(List<Command> commands) {
        this.commands = commands;
    }

    public List<String> trainDog() {
        return commands.stream().map(Command::execute).collect(Collectors.toList());
    }

    public List<Command> getCommands() {
        return commands;
    }

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

}
