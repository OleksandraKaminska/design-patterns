package behavioral.command;

public class Dog {

    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String sitDown(){
        return name + " is sitting...";
    }

    public String standUp() {
        return name + " is standing...";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
