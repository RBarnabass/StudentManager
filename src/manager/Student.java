package manager;

import java.io.IOException;

public class Student {


    private String firstName;
    private String lastName;
    private String sex;
    private String totalName;
    private int age;


    public Student(String firstName, String lastName, int age, String sex) throws IOException {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;

        Menu.count = new NoteOutBook().getNumber();
        System.out.println(Menu.count);

        totalName = this.lastName + " " + this.firstName + " " + this.age + " " + this.sex + " ";
        Menu.list[Menu.count] = totalName;

        new NoteInBook().noteInBook(Menu.list[Menu.count]);
        Menu.count++;
        new NoteInBook().noteNumber(Menu.count);
        System.out.println(Menu.count);
    }
}
