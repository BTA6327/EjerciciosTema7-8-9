import java.util.ArrayList;

public class ArrayListInt {
    public static void main(String[] args) {
        /*
        Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo
        y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
        el primer "for" de relleno.
        */

        System.out.println("***********\n ArrayInt\n***********");

        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 1; i < 11; i++) {
            lista.add(i);

            for (int num = 0; num < lista.size(); num++) {

                if (lista.get(num) % 2 == 0) {
                    lista.remove(num);
                }
            }
        }
        System.out.println(lista);
    }
}
