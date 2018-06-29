package manager;

import java.io.IOException;

public class Selected {
    private final int LIST = 1;
    private final int ADD = 2;
    private final int ADD_BACHELOR = 3;
    private final int REMOVE = 4;
    private final int EXIT = 5;

    public int selected() throws IOException {

        switch (new Scannering().getAction()) {

            case LIST: {
                new Action().showList();
                break;
            }

            case ADD: {
                new Action().addStudent();
                Messeger.studentCreated();
                break;
            }

            case ADD_BACHELOR: {
                new Action().addBachelor();
                Messeger.bachelorIsCreated();
                break;
            }

            case REMOVE: {
                new NoteOutBook().getNoteBookFresh();
                Messeger.removeName();
                new Scannering().remove();
                break;
            }

            case EXIT: {
                Messeger.parting();
                Menu.bool = false;
                break;
            }
        }
        return 0;
    }
}
