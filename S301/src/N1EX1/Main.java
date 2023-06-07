package N1EX1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();
        Scanner input = new Scanner(System.in);
        undo.addUndo(input.nextLine());
        undo.addUndo(input.nextLine());
        Undo undo1 = Undo.getInstance();
        undo1.addUndo(input.nextLine());
        undo1.addUndo(input.nextLine());

        undo1.printUndo();
        undo1.eliminateLast();
        undo1.printUndo();

    }
}
