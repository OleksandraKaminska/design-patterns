package behavioral.command;

public class StandUpCommand implements Command {

    private Dog dog;

    public StandUpCommand(Dog dog) {
        this.dog = dog;
    }

    public String execute() {
        return dog.standUp();
    }

}
