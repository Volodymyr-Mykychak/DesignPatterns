package net.proselyte.basepatterns.behavioral.state;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleeping) {
        } else if (activity instanceof Training) {
        } else if (activity instanceof Coding) {
        } else if (activity instanceof Reading) {
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
