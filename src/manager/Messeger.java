package manager;

public class Messeger {

    public static void greeting() {

        System.out.println();
        System.out.println(" - - - Hello mr.Manager !");
        System.out.println();
    }

    public static void mainMenu() {

        System.out.println();
        System.out.println(" - - - Choose your action, please - - - ");
        System.out.println();
        System.out.println(" >>> 1 - Show the students list\n >>> 2 - Add new student\n >>> 3 - Add new bachelor\n >>> 4 - Remove person\n >>> 5 - Exit");
    }

    public static void parting() {
        System.out.println("Good Bye! It was pleasure to meet you !");
    }

    public static void error() {
        System.out.println(" - - Warning! Incorrect input! Please try again!");
    }

    public static void firstName() {
        System.out.println(" Enter person's first name please ");
    }

    public static void lastName() {
        System.out.println(" And enter person's last name please ");
    }

    public static void age() {
        System.out.println(" Enter person's age please ");
    }

    public static void sex() {
        System.out.println(" Enter person's sex please ");
    }

    public static void studentCreated() {
        System.out.println(" The new student is successfully created ");
    }

    public static void bachelorIsCreated() {
        System.out.println(" The new bachelor is successfully created ");
    }

    public  static void setDefault() {
        System.out.println(" Was set default value");
    }

    public static void removeName() {
        System.out.println(" For removing enter first or last name student");
    }

    public static void staff() {

        System.out.println();
        System.out.println(" = = = That's all what we have = = = ");
        System.out.println();
    }
}
