public class ArrayBidimensional {
    public static void main(String[] args) {

        System.out.println("**********************\n Array Bidimensional\n**********************");

        Integer[][] numeros = {
                {2, 3, 4, 5},
                {4, 9, 16, 25}
        };

        for (int i = 0; i < numeros.length; i++) {

            for (int y = 0; y < numeros[i].length; y++) {

                System.out.println("Fila: " + (i + 1) + " | Columna: " + (y + 1) +
                        "\nEl valor es: " + numeros[i][y] + "\n");
            }
        }
    }
}

