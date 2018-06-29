package manager;

import java.io.IOException;

public class Action {

    private Scannering sc = new Scannering();

    public void showList() {

        Messeger.staff();
        new NoteOutBook().getNoteBook();
    }

    public void addStudent() throws IOException {

        new NoteOutBook().getNumber();
        Messeger.firstName();
        String firstName = sc.getStudentName();

        Messeger.lastName();
        String lastName = sc.getStudentName();

        Messeger.age();
        int age = sc.getAge();

        Messeger.sex();
        String sex = sc.getStudentName();
        new Student(firstName, lastName, age, sex);
    }

    public void delete(int index) throws IOException {

        String[] tmp = new String[Menu.list.length];
        System.arraycopy(Menu.list, 0, tmp, 0, index);
        System.arraycopy(Menu.list, index + 1, tmp, index, tmp.length - index - 1);

        Menu.list = tmp;
        Menu.count = new NoteOutBook().getNumber();
        Menu.count--;

        new NoteInBook().noteNumber(Menu.count);
        new NoteInBook().clear();

        for (int i = 0; i < Menu.list.length; i++) {

            if (Menu.list[i] != null) {
                new NoteInBook().noteInBook(Menu.list[i]);
            }
        }
    }

    public void addBachelor() throws IOException {

        new NoteOutBook().getNumber();
        Messeger.firstName();
        String firstName = sc.getStudentName();

        Messeger.lastName();
        String lastName = sc.getStudentName();

        Messeger.age();
        int age = sc.getAge();

        Messeger.sex();
        String sex = sc.getStudentName();
        new Bachelor(firstName, lastName, age, sex);
    }
}
