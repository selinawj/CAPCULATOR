package capture.capculator;

/**
 * Created by Selina on 9/7/16.
 * Store information about each Semester
 */
public class Semesters {
    private boolean isEmpty;
    private int numModules;
    private int credits;

    public Semesters(boolean isEmpty, int numModules, int credits) {
        super();
        this.isEmpty = isEmpty;
        this.numModules = numModules;
        this.credits = credits;
    }

    public boolean isEmpty() {
        return true;
    }

    public int getCredits() {
        return credits;
    }

    public int getNumModules() {
        return numModules;
    }
}
