package behavioral.state;

public class Dog implements Activity {

    private Activity activity;

    public Dog() {
    }

    public Dog(Activity activity) {
        this.activity = activity;
    }

    public String doActivity() {
        return activity.doActivity();
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

}
