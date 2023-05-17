import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioLibre {
    /*
    Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream,
    excepciones, un HashMap y un ArrayList, LinkedList o array.
     */
    public static void main(String[] args) {
        //Array list
        ArrayList<String> lista = new ArrayList<>();
        boolean ok=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un palabra o pulsa enter para continuar: ");
        while (ok){
            //input stream
            String cadena = scanner.nextLine();
            if(cadena.equals("")){
                ok=false;
            }else {
                lista.add(cadena);
            }
        }
        //hashmap
        HashMap<String, String> mapa = new HashMap<>();
        int i =1;
        String clave="clave";
        for(String obj: lista){
            mapa.put(clave+i, obj);
            i++;
        }
        try {
            //output stream
            System.out.println("Introduce el fichero de destino: ");
            String fileOut = scanner.nextLine();
            PrintStream out = new PrintStream(fileOut);
            String val="";
            for (Map.Entry<String, String> elemento : mapa.entrySet()) {
                val="Clave: " + elemento.getKey() + " - Valor: " + elemento.getValue();
                out.println(val);
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }finally {
            System.out.println("Finalizado");
        }
    }
}
