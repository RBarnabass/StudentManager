package manager;

import java.io.IOException;

public class Bachelor extends Student {

    public Bachelor(String firstName, String lastName, int age, String sex) throws IOException {
        super(firstName, lastName, age, sex + " " + "Bachelor");

    }
}
