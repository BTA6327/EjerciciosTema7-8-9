import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListString {
    public static void main(String[] args) {
        /*
        Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        Recorre ambos mostrando únicamente el valor de cada elemento.
        */
        System.out.println("******************** \n Array y LinkedList\n********************");

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("UNO");
        lista.add("DOS");
        lista.add("TRES");
        lista.add("CUATRO");

        LinkedList<String> linkedlist = new LinkedList<String>();

        for (int i = 0; i < lista.size(); i++) {
            linkedlist.add(i, lista.get(i));
        }

        System.out.println("Elementos del Array:");
        for (String elementos : lista) {
            System.out.print(elementos + " ");
        }

        System.out.println("\n\nElementos de la LinkedList:");
        for (String elementos : linkedlist) {
            System.out.print(elementos + " ");
        }
    }
}
