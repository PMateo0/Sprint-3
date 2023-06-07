package N1EX1;

import java.util.ArrayList;

public class Undo {
    private static Undo instance;
    private ArrayList opcion;
    private Undo(){
        opcion = new ArrayList<>();
    }
    public static Undo getInstance(){
        if(instance ==null){
            instance = new Undo();
        }
        return instance;
    }
    // Metodos de Undo
    public void addUndo(String string){
        opcion.add(string);
    }
    public void printUndo(){
        opcion.stream().forEach(System.out::println);
    }
    public void eliminateLast(){
        opcion.remove(opcion.size() - 1);
    }

}
