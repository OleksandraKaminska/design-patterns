package behavioral.command;

public class SitDownCommad implements Command {

    private Dog dog;

    public SitDownCommad(Dog dog) {
        this.dog = dog;
    }

    public String execute() {
       return dog.sitDown();
    }

}
