package capture.capculator;

/**
 * Created by Selina on 10/7/16.
 * Store Info about a module*/

public class Module {
    private String code;
    private String mc;
    private String grade;

    public Module(String code, String mc, String grade) {
        super();
        this.code = code;
        this.mc = mc;
        this.grade = grade;
    }

    public String getCode() {
        return code;
    }

    public String getMC() {
        return mc;
    }

    public String getGrade() {
        return grade;
    }
}
