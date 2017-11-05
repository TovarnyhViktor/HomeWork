package Home_Work_10;

import java.util.ArrayList;

public class Forms {
    public String name;
    public ArrayList<Form> forms = new ArrayList<>();

    @Override
    public String toString() {
        return "Forms{" +
                "name='" + name + '\'' +
                ", forms=" + forms +
                '}';
    }
}
